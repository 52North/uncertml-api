package org.uncertml.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.uncertml.IUncertainty;
import org.uncertml.distribution.continuous.NormalDistribution;
import org.uncertml.io.JSONEncoder;
import org.uncertml.io.JSONParser;

public class JSONIOTestCase extends TestCase {

    private JSONEncoder je;
    private JSONParser jp;

    public void testEncoder() {
        try {
            IUncertainty u = new NormalDistribution(0, 1);
            String json = je.encode(u);

            // writer
            StringWriter w = new StringWriter();
            je.encode(u, w);
            Assert.assertEquals(json, w.toString());

            // stream
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            je.encode(u, b);
            Assert.assertEquals(json, b.toString());

            // file
            File f = new File(String.valueOf(System.currentTimeMillis()) + ".json");
            je.encode(u, f);
            char[] buf = new char[1024];
            int c;
            FileReader fr = new FileReader(f);
            StringWriter sr = new StringWriter();
            while ((c = fr.read(buf)) != -1) {
                sr.write(buf, 0, c);
            }
            f.delete();
            Assert.assertEquals(json, sr.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testParser() {
        try {
            IUncertainty u = new NormalDistribution(0, 1);
            String json = je.encode(u);

            // string
            IUncertainty u2 = jp.parse(json);
            Assert.assertEquals(json, je.encode(u2));

            // stream
            ByteArrayInputStream b = new ByteArrayInputStream(json.getBytes());
            u2 = jp.parse(b);
            Assert.assertEquals(json, je.encode(u2));

            // file
            File f = new File(String.valueOf(System.currentTimeMillis()) + ".json");
            je.encode(u, f);
            u2 = jp.parse(f);
            Assert.assertEquals(json, je.encode(u2));
            f.delete();

            // reader
            StringReader r = new StringReader(json);
            u2 = jp.parse(r);
            Assert.assertEquals(json, je.encode(u2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setUp() {
        je = new JSONEncoder();
        jp = new JSONParser();
    }

}

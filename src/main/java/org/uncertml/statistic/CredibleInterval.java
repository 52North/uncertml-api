/**
 * Copyright 2014 52°North Initiative for Geospatial Open Source Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uncertml.statistic;

/**
 * Class representing a credible interval statistic. A credible interval is comprised
 * of two quantiles, an upper and lower bound.
 * 
 * {@URL https://wiki.aston.ac.uk/foswiki/bin/view/UncertWeb/CredibleInterval}
 * 
 * @see org.uncertml.statistic.Quantile
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public class CredibleInterval implements IStatistic {

    private Quantile lower;
    private Quantile upper;

    /**
     * Constructor that takes a lower and upper bound, represented as quantiles.
     * 
     * @see org.uncertml.statistic.Quantile
     * 
     * @param lower the lower bound, represented as a <code>Quantile</code>.
     * @param upper the upper bound, represented as a <code>Quantile</code>.
     */
    public CredibleInterval(Quantile lower, Quantile upper) {
        this.lower = lower;
        this.upper = upper;
    }

    /**
     * 
     * @return the lower bound of the credible interval.
     */
    public Quantile getLower() {
        return lower;
    }

    /**
     * 
     * @return the upper bound of the credible interval.
     */
    public Quantile getUpper() {
        return upper;
    }

}

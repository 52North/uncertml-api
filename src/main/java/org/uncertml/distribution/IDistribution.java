package org.uncertml.distribution;

import org.uncertml.IUncertainty;

/**
 * An interface that all UncertML distributions implement. Extends the 
 * <code>IUncertainty</code> interface.
 * 
 * @author Matthew Williams
 * @version 2.0
 */
public interface IDistribution extends IUncertainty {
	static interface IParameter extends IUncertainty {};
	
}

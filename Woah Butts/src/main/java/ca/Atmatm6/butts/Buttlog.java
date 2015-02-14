package ca.Atmatm6.butts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Austin on 2015-02-09.
 */
public abstract class Buttlog implements Logger {
    public static Logger logger = LogManager.getLogger(BootyReference.bootname + "");

}

package info;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Video {
	
	static final Logger logger = LogManager.getLogger(Video.class.getName());
	
	boolean isPlaying = false;
	public boolean startPlaying() {
		if(this.isPlaying == false) {
			this.isPlaying = true;			
			logger.info("video started playing");
			logger.debug("this is a debug tag");
			logger.error("this is an error tag");
			logger.warn("this is a warnig tag");
			logger.fatal("this is a fatal tag");
		}		
		return isPlaying;
	}
	public boolean stopPlaying() {
		if(this.isPlaying == true) {
			this.isPlaying = false;
			logger.info("video stopped playing");
		}
		return isPlaying;
	}
}

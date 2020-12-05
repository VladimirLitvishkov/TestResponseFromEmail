package test.service;


public interface EmailTestService {
	
	void sendEmail();
	
	byte[] responseFromEmail(Integer emailId);

}

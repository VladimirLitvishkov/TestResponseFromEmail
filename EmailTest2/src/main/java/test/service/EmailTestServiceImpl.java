package test.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

//import test.model.Email;
//import test.repository.EmailTestRepository;

@Service
public class EmailTestServiceImpl implements EmailTestService {
	
//	@Autowired
//	EmailTestRepository repository;
	
	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendEmail() {
//		MimeMessage message = mailSender.createMimeMessage();
//		MimeMessageHelper helper;
//		String htmlBlock = "<html><body><img src='https://pbs.twimg.com/profile_images/758084549821730820/_HYHtD8F.jpg'></body></html>";
//		try {
//			helper = new MimeMessageHelper(message, true);
//			helper.setTo("v.litva.alf@gmail.com");
//			helper.setText(htmlBlock, true);
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("v.litva.alf@gmail.com");
		message.setText("Test");
		mailSender.send(message);
//		Email email = Email.builder().build();
//		repository.save(email);

	}

	@Override
	public byte[] responseFromEmail(Integer emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}

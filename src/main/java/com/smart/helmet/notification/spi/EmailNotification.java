package com.smart.helmet.notification.spi;



public interface EmailNotification<T,D> {

	public D sendEmail(String[] mailTo, String[] mailCc, String mailSubject,
			String mailContent, T attachments);
}

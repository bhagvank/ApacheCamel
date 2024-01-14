package org.javacodegeeks;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class ExampleApplication {

	public static void main(String[] args) {
		ExampleRouteBuilder routeBuilder = new ExampleRouteBuilder();
		CamelContext context = new DefaultCamelContext();
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://0.0.0.0:61616");
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
		try {
			context.addRoutes(routeBuilder);
			context.start();
			Thread.sleep(5 * 60 * 1000);
			context.stop();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
}
package org.javacodegeeks;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class ExampleRouteBuilder extends RouteBuilder {

	int count;

	@Override
	public void configure() throws Exception {

		interceptFrom("*").process(new Processor() {
			public void process(Exchange exchange) {
				count++;
				System.out.println("interceptor called " + count + " times " + exchange.getIn().getBody());

			}
		});

		from("file:mailbox?noop=true").split().tokenize("\n").to("jms:queue:javacodegeeks1");
		from("jms:queue:javacodegeeks1").to("jms:queue:javacodegeeks2");
		from("jms:queue:javacodegeeks2").to("jms:queue:javacodegeeks3");
	}

}
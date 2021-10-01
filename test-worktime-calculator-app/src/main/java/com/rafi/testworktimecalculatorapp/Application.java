package com.rafi.testworktimecalculatorapp;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.vaadin.artur.helpers.LaunchUtil;

@SpringBootApplication
@NpmPackage(value = "line-awesome", version = "1.3.0")
@EnableEurekaClient
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {

	public static void main(String[] args) {
		LaunchUtil.launchBrowserInDevelopmentMode(SpringApplication.run(Application.class, args));
	}

}

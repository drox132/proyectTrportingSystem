package com.fran.reportingSystem.mail;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailContentBuilderServiceImplementation implements MailContentBuilderService{

    private final TemplateEngine templateEngine;

    public MailContentBuilderServiceImplementation(TemplateEngine templateEngine){
        this.templateEngine = templateEngine;
    }

    @Override
    public String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}

package com.finder.bar.domain.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionRepositoryWrapper {
	
	private final QuestionRepository repository;
	
	@Autowired
	public QuestionRepositoryWrapper(final QuestionRepository repository) {
		this.repository = repository;
	}
		
	public void save(final Question question) {
        this.repository.save(question);
    }

    public void saveAndFlush(final Question question) {
        this.repository.saveAndFlush(question);
    }
    
    public void delete(final Question question) {
        this.repository.delete(question);
        this.repository.flush();
    }
}

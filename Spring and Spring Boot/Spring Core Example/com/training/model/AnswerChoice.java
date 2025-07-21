/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.model;

/**
 *
 * @author Administrator
 */
public class AnswerChoice {
    String answerText;
    boolean rightChoice;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

	public boolean isRightChoice() {
		return rightChoice;
	}

	public void setRightChoice(boolean rightChoice) {
		this.rightChoice = rightChoice;
	}

	@Override
	public String toString() {
		return "AnswerChoice [answerText=" + answerText + ", rightChoice=" + rightChoice + "]";
	}

   
}

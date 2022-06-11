package co.com.sofka.questions.usecases;

import co.com.sofka.questions.collections.Answer;
import co.com.sofka.questions.collections.Question;
import co.com.sofka.questions.model.AnswerDTO;
import co.com.sofka.questions.model.QuestionDTO;
import co.com.sofka.questions.reposioties.AnswerRepository;
import co.com.sofka.questions.reposioties.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AddAnswerUseCaseTest {

    QuestionRepository questionRepository;
    AnswerRepository answerRepository;
    AddAnswerUseCase addAnswerUseCase;

    GetUseCase getUseCase;


    @BeforeEach
    public void setup(){
        MapperUtils mapperUtils = new MapperUtils();
        answerRepository = mock(AnswerRepository.class);
        questionRepository = mock(QuestionRepository.class);
        getUseCase = new GetUseCase(mapperUtils, questionRepository, answerRepository);
        addAnswerUseCase = new AddAnswerUseCase(mapperUtils, getUseCase, answerRepository);
    }

    @Test
    void AddAnswerValidationTest(){

        var answerDTO = new AnswerDTO("qqq","xxx", "answer");
        var answer =  new Answer();
        answer.setUserId("qqq");
        answer.setQuestionId("xxx");
        answer.setAnswer("answer");

        var questionDto = new QuestionDTO("qqq","xxxx-xxxx", "¿Que es java?", "tech", "software");

        when(answerRepository.save(Mockito.any(Answer.class))).thenReturn(Mono.just(answer));

        StepVerifier.create(getUseCase.apply(answer.getQuestionId())).expectComplete();


    }


}
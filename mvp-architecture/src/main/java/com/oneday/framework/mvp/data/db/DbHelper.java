package com.oneday.framework.mvp.data.db;

import com.oneday.framework.mvp.data.db.model.Option;
import com.oneday.framework.mvp.data.db.model.Question;
import com.oneday.framework.mvp.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by OneDay on 2017/12/19.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

    Observable<List<Question>> getAllQuestions();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveQuestionList(List<Question> questionList);

    Observable<Boolean> saveOptionList(List<Option> optionList);
}

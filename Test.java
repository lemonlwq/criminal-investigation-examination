package com.lemon;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by MLinWQ on 2018/3/3 0003.
 */

public class Test {
    private Question[] testList = new Question[10];

    public void initQuestion() {
        testList[0] = new Question(null) {
            @Override
            public void check() {
                setChecked(true);

            }
        };
        testList[1] = new Question(testList[0]) {
            @Override
            public void check() {
                switch (getAnswer()) {
                    case A:
                        if (testList[4].getAnswer() == Answer.C)
                            setChecked(true);
                        break;
                    case B:
                        if (testList[4].getAnswer() == Answer.D)
                            setChecked(true);
                        break;
                    case C:
                        if (testList[4].getAnswer() == Answer.A)
                            setChecked(true);
                        break;
                    case D:
                        if (testList[4].getAnswer() == Answer.B)
                            setChecked(true);
                        break;
                }
            }
        };
        testList[2] = new Question(testList[1]) {
            @Override
            public void check() {
                switch (getAnswer()) {
                    case A:
                        if (testList[2].getAnswer() != testList[5].getAnswer() && testList[2].getAnswer() != testList[1].getAnswer() && testList[2].getAnswer() != testList[3].getAnswer())
                            setChecked(true);
                        break;
                    case B:
                        if (testList[5].getAnswer() != testList[2].getAnswer() && testList[5].getAnswer() != testList[1].getAnswer() && testList[5].getAnswer() != testList[3].getAnswer())
                            setChecked(true);
                        break;
                    case C:
                        if (testList[1].getAnswer() != testList[2].getAnswer() && testList[1].getAnswer() != testList[5].getAnswer() && testList[1].getAnswer() != testList[3].getAnswer())
                            setChecked(true);
                        break;
                    case D:
                        if (testList[3].getAnswer() != testList[2].getAnswer() && testList[3].getAnswer() != testList[5].getAnswer() && testList[3].getAnswer() != testList[1].getAnswer())
                            setChecked(true);
                        break;
                }
            }
        };
        testList[3] = new Question(testList[2]) {
            @Override
            public void check() {
                switch (getAnswer()) {
                    case A:
                        if (testList[0].getAnswer() == testList[4].getAnswer())
                            setChecked(true);
                        break;
                    case B:
                        if (testList[1].getAnswer() == testList[6].getAnswer())
                            setChecked(true);
                        break;
                    case C:
                        if (testList[0].getAnswer() == testList[8].getAnswer())
                            setChecked(true);
                        break;
                    case D:
                        if (testList[5].getAnswer() == testList[9].getAnswer())
                            setChecked(true);
                        break;
                }
            }
        };
        testList[4] = new Question(testList[3]) {
            @Override
            public void check() {
                switch (getAnswer()) {
                    case A:
                        if (testList[7].getAnswer() == Answer.A)
                            setChecked(true);
                        break;
                    case B:
                        if (testList[3].getAnswer() == Answer.B)
                            setChecked(true);
                        break;
                    case C:
                        if (testList[8].getAnswer() == Answer.C)
                            setChecked(true);
                        break;
                    case D:
                        if (testList[6].getAnswer() == Answer.D)
                            setChecked(true);
                        break;
                }
            }
        };
        testList[5] = new Question(testList[4]) {
            @Override
            public void check() {
                switch (getAnswer()) {
                    case A:
                        if (testList[1].getAnswer() == testList[3].getAnswer() && testList[3].getAnswer() == testList[7].getAnswer())
                            setChecked(true);
                        break;
                    case B:
                        if (testList[0].getAnswer() == testList[5].getAnswer() && testList[5].getAnswer() == testList[7].getAnswer())
                            setChecked(true);
                        break;
                    case C:
                        if (testList[2].getAnswer() == testList[9].getAnswer() && testList[9].getAnswer() == testList[7].getAnswer())
                            setChecked(true);
                        break;
                    case D:
                        if (testList[4].getAnswer() == testList[8].getAnswer() && testList[8].getAnswer() == testList[7].getAnswer())
                            setChecked(true);
                        break;
                }
            }
        };
        testList[6] = new Question(testList[5]) {
            @Override
            public void check() {
                Integer[] sumList = countAnswer();
                Integer min = Collections.min(Arrays.asList(sumList));

                switch (getAnswer()) {
                    case A:
                        if (min.equals(sumList[2]))
                            setChecked(true);
                        break;
                    case B:
                        if (min.equals(sumList[1]))
                            setChecked(true);
                        break;
                    case C:
                        if (min.equals(sumList[0]))
                            setChecked(true);
                        break;
                    case D:
                        if (min.equals(sumList[3]))
                            setChecked(true);
                        break;
                }
            }
        };
        testList[7] = new Question(testList[6]) {
            @Override
            public void check() {
                int index = testList[0].getAnswer().ordinal();
                switch (getAnswer()) {
                    case A:
                        if (testList[6].getAnswer().ordinal() != (index - 1) ||testList[6].getAnswer().ordinal() != (index + 1))
                            setChecked(true);
                        break;
                    case B:
                        if (testList[1].getAnswer().ordinal() != (index - 1) ||testList[1].getAnswer().ordinal() != (index + 1))
                            setChecked(true);
                        break;
                    case C:
                        if (testList[1].getAnswer().ordinal() != (index - 1) ||testList[1].getAnswer().ordinal() != (index + 1))
                            setChecked(true);
                        break;
                    case D:
                        if (testList[9].getAnswer().ordinal() != (index - 1) ||testList[9].getAnswer().ordinal() != (index + 1))
                            setChecked(true);
                        break;
                }
            }
        };
        testList[8] = new Question(testList[7]) {
            @Override
            public void check() {
                if(testList[0].getAnswer() == testList[5].getAnswer()){
                    switch (getAnswer()) {
                        case A:
                            if (testList[5].getAnswer() != testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case B:
                            if (testList[9].getAnswer() != testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case C:
                            if (testList[1].getAnswer() != testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case D:
                            if (testList[8].getAnswer() != testList[4].getAnswer())
                                setChecked(true);
                            break;
                    }
                }else {
                    switch (getAnswer()) {
                        case A:
                            if (testList[5].getAnswer() == testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case B:
                            if (testList[9].getAnswer() == testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case C:
                            if (testList[1].getAnswer() == testList[4].getAnswer())
                                setChecked(true);
                            break;
                        case D:
                            if (testList[8].getAnswer() == testList[4].getAnswer())
                                setChecked(true);
                            break;
                    }
                }
            }
        };
        testList[9] = new Question(testList[8]) {
            @Override
            public void check() {
                Integer[] sumList = countAnswer();
                int result = Collections.max(Arrays.asList(sumList)) - Collections.min(Arrays.asList(sumList));
                switch (getAnswer()) {
                    case A:
                        if (result == 3)
                            setChecked(true);
                        break;
                    case B:
                        if (result == 2)
                            setChecked(true);
                        break;
                    case C:
                        if (result == 4)
                            setChecked(true);
                        break;
                    case D:
                        if (result == 1)
                            setChecked(true);
                        break;
                }
            }
        };
    }

    public Integer[] countAnswer(){
        Integer[] countList = {0, 0, 0, 0};

        for(Question question : testList){
            switch (question.getAnswer()){
                case A:
                    countList[0]++;
                    break;
                case B:
                    countList[1]++;
                    break;
                case C:
                    countList[2]++;
                    break;
                case D:
                    countList[3]++;
                    break;
            }
        }
        return countList;
    }

    public boolean checkEnd(){
        for(Question question : testList){
            if(question.getAnswer() != Answer.D);
                return false;
        }
        return true;
    }

    public boolean checkList(){
        boolean isOk = true;

        if(checkEnd()){
            System.out.println("无法计算出结果");
            return true;
        }

        for(Question question : testList){
            question.setChecked(false);
            question.check();
            if(!(isOk & question.isChecked())){
                testList[9].changeAnswer();
                return false;
            }
        }

        System.out.print("The answer is " + Arrays.toString(testList));
        return isOk;
    }

    public static void main(String[] args){
        Test test = new Test();
        test.initQuestion();
        while (!test.checkList()){}
    }
}

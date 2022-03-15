import java.awt.*;
//import java.awt.event.InputEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class AutoClicker {
    static int tabs =                           20;
    static int delay_between_actions =          20;
    static int delay_between_updating_tabs =    30;
    static int delay_5_window_rest =            5000;
    static int delay_rest =                     2000;

    public static void main(String[] args) throws AWTException { //15.2 per minute
//        int seconds = Integer.parseInt(readLine("Amount of seconds working:")); // 221 236.2
//        int start_time = (int) new Date().getTime()/1000;
//        int end_time = start_time+seconds;
//        Robot robot = new Robot();
//        robot.delay(5000);
//
//        int x = 0;
//        while ((int) new Date().getTime()/1000 < end_time) {
//            for (int x1 = 0; x1 < tabs; x1++) {
//                robot.keyPress(KeyEvent.VK_F5);
//                robot.delay(delay_between_actions);
//                robot.keyRelease(KeyEvent.VK_F5);
//                robot.delay(delay_between_updating_tabs);
//
//                robot.keyPress(KeyEvent.VK_CONTROL);
//                robot.delay(delay_between_actions);
//                robot.keyPress(KeyEvent.VK_SHIFT);
//                robot.delay(delay_between_actions);
//                robot.keyPress(KeyEvent.VK_TAB);
//                robot.delay(delay_between_actions);
//                robot.keyRelease(KeyEvent.VK_TAB);
//                robot.delay(delay_between_actions);
//                robot.keyRelease(KeyEvent.VK_SHIFT);
//                robot.delay(delay_between_actions);
//                robot.keyRelease(KeyEvent.VK_CONTROL);
//                robot.delay(delay_between_actions);
//            }
//            if (x % 10 == 0) {
//                robot.delay(delay_5_window_rest);
//            } else {
//                robot.delay(delay_rest);
//            }
//            x++;
//        }

//        for (int x = 0; x < times; x++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.delay(20);
//
//            robot.keyPress(KeyEvent.VK_N);
//            robot.delay(20);
//            robot.keyRelease(KeyEvent.VK_N);
//            robot.delay(100);
//
//            for (int x1 = 0; x1 < 40; x1++) {
//                robot.keyPress(KeyEvent.VK_T);
//                robot.delay(20);
//                robot.keyRelease(KeyEvent.VK_T);
//                robot.delay(20);
//            }
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.delay(15000);
//
//            robot.keyPress(KeyEvent.VK_ALT);
//            robot.delay(20);
//            robot.keyPress(KeyEvent.VK_F4);
//            robot.delay(20);
//            robot.keyRelease(KeyEvent.VK_F4);
//            robot.delay(20);
//            robot.keyRelease(KeyEvent.VK_ALT);
//            robot.delay(20);
//
//            robot.delay(2000);
//        }

        try {
            int seconds = Integer.parseInt(readLine("Amount of seconds clicking:"));
            Robot robot = new Robot();
            robot.delay(5000);

            for (int x = 0; x < seconds*25; x++) {
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                robot.delay(1);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//                robot.delay(1);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }

//            for (int x = 0; x < 1; x++) {
                //Спам-бот
//                robot.keyPress(KeyEvent.VK_CONTROL);
//                robot.keyPress(KeyEvent.VK_V);
//                robot.keyRelease(KeyEvent.VK_V);
//                robot.keyRelease(KeyEvent.VK_CONTROL);
//                robot.keyPress(KeyEvent.VK_ENTER);
//                robot.keyRelease(KeyEvent.VK_ENTER);

                //Автокликер
//                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                //New Google Tabs
//                robot.keyPress(KeyEvent.VK_T);
//                robot.delay(10);
//                robot.keyRelease(KeyEvent.VK_T);
//                robot.delay(100);
//            }
    }
    public static String readLine() {
        return readLine("");
    }
    public static String readLine(String message) {
        System.out.print(message+"  ");
        String returnString = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            returnString = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnString;
    }

    private static class FrameKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            switch (e.getKeyChar()) {
                case 0x1B:
                    System.exit(0);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }


    public static void autoScrollUp() {
        try {
            int seconds = Integer.parseInt(readLine("Amount of seconds scrolling up:"));
            Robot robot = new Robot();
            robot.delay(5000);

            for (int x = 0; x < seconds*5300; x++) {
                robot.mouseWheel(-1);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public static void autoScrollDown() {
        try {
            int seconds = Integer.parseInt(readLine("Amount of seconds scrolling down:"));
            Robot robot = new Robot();
            robot.delay(5000);

            for (int x = 0; x < seconds*5300; x++) {
                robot.mouseWheel(1);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void autoSendingOrderedNumbersFromTwoDiscordAccounts() {
        try {
            int currentNumber = Integer.parseInt(readLine("First number to write:"));
            int amountOfNumbersToWrite = Integer.parseInt(readLine("Amount of numbers to write:"));
            Robot robot = new Robot();
            robot.delay(7000);

            boolean failure = false;
            for (int x = 0; x < amountOfNumbersToWrite; x++) {
                if (!failure) {
                    robot.keyPress(KeyEvent.VK_ALT);
                    robot.delay(20);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.delay(20);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    robot.delay(20);
                    robot.keyRelease(KeyEvent.VK_ALT);
                    robot.delay(20);
                }
                if (((int) (Math.random() * 10)) != 1 && !failure && x != 0) {
                    currentNumber++;
                }
                failure = false;
                for (String i : String.valueOf(currentNumber).split("")) {
                    switch (i) {
                        case "0":
                            robot.keyPress(0x30);
                            robot.delay(2);
                            robot.keyRelease(0x30);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x30);
                                robot.delay(2);
                                robot.keyRelease(0x30);
                                failure = true;
                            }
                            break;
                        case "1":
                            robot.keyPress(0x31);
                            robot.delay(2);
                            robot.keyRelease(0x31);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x31);
                                robot.delay(2);
                                robot.keyRelease(0x31);
                                failure = true;
                            }
                            break;
                        case "2":
                            robot.keyPress(0x32);
                            robot.delay(2);
                            robot.keyRelease(0x32);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x32);
                                robot.delay(2);
                                robot.keyRelease(0x32);
                                failure = true;
                            }
                            break;
                        case "3":
                            robot.keyPress(0x33);
                            robot.delay(2);
                            robot.keyRelease(0x33);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x33);
                                robot.delay(2);
                                robot.keyRelease(0x33);
                                failure = true;
                            }
                            break;
                        case "4":
                            robot.keyPress(0x34);
                            robot.delay(2);
                            robot.keyRelease(0x34);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x34);
                                robot.delay(2);
                                robot.keyRelease(0x34);
                                failure = true;
                            }
                            break;
                        case "5":
                            robot.keyPress(0x35);
                            robot.delay(2);
                            robot.keyRelease(0x35);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x35);
                                robot.delay(2);
                                robot.keyRelease(0x35);
                                failure = true;
                            }
                            break;
                        case "6":
                            robot.keyPress(0x36);
                            robot.delay(2);
                            robot.keyRelease(0x36);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x36);
                                robot.delay(2);
                                robot.keyRelease(0x36);
                                failure = true;
                            }
                            break;
                        case "7":
                            robot.keyPress(0x37);
                            robot.delay(2);
                            robot.keyRelease(0x37);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x37);
                                robot.delay(2);
                                robot.keyRelease(0x37);
                                failure = true;
                            }
                            break;
                        case "8":
                            robot.keyPress(0x38);
                            robot.delay(2);
                            robot.keyRelease(0x38);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x38);
                                robot.delay(2);
                                robot.keyRelease(0x38);
                                failure = true;
                            }
                            break;
                        case "9":
                            robot.keyPress(0x39);
                            robot.delay(2);
                            robot.keyRelease(0x39);
                            if (((int) (Math.random()*70)) == 1) {
                                robot.keyPress(0x39);
                                robot.delay(2);
                                robot.keyRelease(0x39);
                                failure = true;
                            }
                            break;
                    }
                    robot.delay(40);
                }
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(2);
                robot.keyRelease(KeyEvent.VK_ENTER);

                robot.delay(1000+((int) (Math.random()*1000)));
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

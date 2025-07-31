import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath_Question = "D:\\IDEA\\workplace\\Calculate\\计算题.txt";
        String filePath_Answer = "D:\\IDEA\\workplace\\Calculate\\计算题答案.txt";

        System.out.println("需要的题目数量：");
        int num = scanner.nextInt();

        System.out.println("需要的数：");
        System.out.println("1：整数");
        int method = scanner.nextInt();

        System.out.println("题目组成结构：");
        System.out.println("1:全是加法；2：全是减法；3：全是乘法；4：全是除法");

        int model = scanner.nextInt();
        if (method == 1) {
            method1(model,num,filePath_Question,filePath_Answer);
        }

    }

    public static void method1(int model, int num, String filePath_Question, String filePath_Answer) {
        while (num != 0) {
            Maker maker = new Maker();
            if(model == 1) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Question,true))) {
                    // 写入内容
                    writer.write(maker.integerAndMake());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Answer,true))) {
                    // 写入内容
                    writer.write(maker.integerAndAnswer());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }
                num--;
            }
            else if (model == 2) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Question,true))) {
                    // 写入内容
                    writer.write(maker.integerMinusMake());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Answer,true))) {
                    // 写入内容
                    writer.write(maker.integerMinusAnswer());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }
                num--;
            }
            else if (model == 3) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Question,true))) {
                    // 写入内容
                    writer.write(maker.integerMultiplyMake());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Answer,true))) {
                    // 写入内容
                    writer.write(maker.integerMultiplyAnswer());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }
                num--;
            }
            else if (model == 4) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Question,true))) {
                    // 写入内容
                    writer.write(maker.integerDivideMake());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath_Answer,true))) {
                    // 写入内容
                    writer.write(maker.integerDivideAnswer());
                    writer.newLine(); // 换行
                } catch (IOException e) {
                    // 处理异常（如路径错误、权限问题等）
                    e.printStackTrace();
                }
                num--;
            }
        }
        System.out.println("内容已成功写入文件！");
    }
}

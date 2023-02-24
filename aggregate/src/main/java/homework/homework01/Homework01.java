package homework.homework01;

import java.util.ArrayList;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/11 20:16
 * 封装有一个新闻类包含标题和内容两个属性，将新闻对象封装到结婚证并倒叙遍历，不标题超过
 * 15个自使用后……
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList<News> news = new ArrayList<>();
        news.add(new News("欠债不还，罗永浩“真还传”烂尾了？","点击看向前"));
        news.add(new News("现在还有必要继续戴口罩吗？最新回应","点击看向前"));
        news.add(new News("日本抗议中国暂停审发日本公民赴华签证","点击看向前"));
        news.add(new News("上任三天 麦卡锡成立针对中国的特别委员会","点击看向前"));
        news.add(new News("三个区分开来内涵是什么？提出背景是什么？目的又是什么？一起打卡学习。","点击看向前"));
        news.add(new News("自1月10日起，多地省级两会拉开帷幕。各地将如何规划今年的发展目标？今年省级两会有哪些亮点？","点击看向前"));
        news.add(new News("新时代新征程新伟业","点击看向前"));
        //逆序打印
        for (int i = news.size() - 1;i >= 0;i --){
            if (news.get(i).getTitle() == null){
                System.out.println("");
            }else if (news.get(i).getTitle().length() > 15){
                System.out.println(news.get(i).getTitle().substring(0,15) + "....");
            }else {
                System.out.println(news.get(i).getTitle());
            }
        }
    }
}

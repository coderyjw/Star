package com.example.star.bean.gson;

import org.litepal.crud.DataSupport;

public class Year  extends DataSupport {
    /**
     * health_txt : 2018年疲劳致病的机率会明显高于以往。今年会有感冒、上火等小病不断滋扰。忙碌的日子你更需要停下来歇歇，保持饮食起居的时间规范和质量，否则小心身体将会向你发出抗议。年纪较大的人，腰膝方面若出现问题定要及时就医，谨遵医嘱。不妨安排一次贴近大自然的山水之旅、或一次探访神圣之地的信仰之旅，不仅能让你有诸多感悟与成长，亦能收获不少喜悦，而冥冥中也将有对你很重要的东西潜藏其中。
     * love_txt : 2018年该来的人会来，该走的人也会走，缘来缘散如流水。关于爱情的事，只要你有所求，则必得一果，比如挥别不快的旧爱、暧昧关系的终结、一段新恋情的开始等等。需提醒的是，结果的好坏并不局限于眼前，需看向长远，所以务必调整好你的心态，争取在每一个分岔路口作出最佳的抉择。感到困惑时，年长的异性会是你的爱情贵人，可以主动求教。春暖花开时，单身的你桃花运渐旺，酒杯里也能蹦出爱情来。酒桌上优雅得体的言行、和酒后与异性独处暧昧的氛围，都是增进感情的利器，但切忌贪杯误事。已婚恋的则需谨记“相信谎言的人必将走向毁灭”，配偶间的争吵与误会难免，但信任会使羁绊更加稳固，而猜疑只会让小人趁虚而入。
     * work_txt : 2018年强大的力量将帮助你从过去的暗影中走出来，事业迎来光明之象。虽然此后需要应付的困难会比较多，但若能坚持不懈、冷静思考对策，事情都将得到妥善解决。好的方法能让你事半功倍，不仅能力得到提升，上司或合作对象也会对你赞赏有加。切记工作之事没有捷径可以走，需要帮助时，不妨将你的需求传达给合适的人，他会助你一臂之力。人间四月天，升职加薪忙。对上班族而言，春季实现升职加薪愿望的机率较大，此时合作能力也增加，团队项目超额完成，将使你名利双收。下半年跳槽求职的胜利之门大开，门后天高任鸟飞。身为老板的人，今年需要烦心的事较少，身边得力的员工会帮你解决掉许多问题，记得善用奖金激励他们。
     * time : 2018
     * money_txt : 2018年随着事业运的提升，正财收入能相应丰厚，然而钱财易得则不易守，随之增强的还有旺盛的购物欲，且可能伴随置业装修、购买奢侈品等大笔款项支出，外出旅游的心也在蠢蠢欲动，时有辛苦却为他人做了嫁衣裳的感叹。不过若能买得愉快、玩得开心，也无需太过介怀。有存钱需要的则务必克制冲动消费，“守”得住才能帮助钱包增肥成功。正财大可交给神灵来庇佑，他绝对不会亏待你，靠手艺和人脉关系所开之财源将更广、更灵活。但今年你偏财稍逊，股市汇市、基金房产这些投资务必谨慎，有风险的项目能缓则缓，切勿眼馋他人、盲目投资。
     * work_index : 90分
     * money_index : 65分
     * general_txt : 2018年对白羊座来说是一个好时机，你有望步入一个新的人生阶段，比如转职谋求到一份满意的工作、事业生意迎来一个新的发展阶段、展开一段甜蜜恋情、与另一半孕育新生命等等，然而最佳的机会需要靠你的智慧才能把握。凡事多看多想多沟通，冲动、大意会让你错失近在眼前的好机会。上半年，4、5月好运频发、喜讯连连；下半年在事业上努力而为，能够有所突破，创造一番新气象。入冬后，心绪如同风中飘雪慢慢坠跌，然而多愁善感的同时也造成创作灵感迸发，此时理性的朋友将会是你的贵人。
     * oneword : 时运流转 砥砺前行
     * general_index : 85分
     * love_index : 70分
     */

    private String health_txt;
    private String love_txt;
    private String work_txt;
    private String time;
    private String money_txt;
    private String work_index;
    private String money_index;
    private String general_txt;
    private String oneword;
    private String general_index;
    private String love_index;

    public String getHealth_txt() {
        return health_txt;
    }

    public void setHealth_txt(String health_txt) {
        this.health_txt = health_txt;
    }

    public String getLove_txt() {
        return love_txt;
    }

    public void setLove_txt(String love_txt) {
        this.love_txt = love_txt;
    }

    public String getWork_txt() {
        return work_txt;
    }

    public void setWork_txt(String work_txt) {
        this.work_txt = work_txt;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMoney_txt() {
        return money_txt;
    }

    public void setMoney_txt(String money_txt) {
        this.money_txt = money_txt;
    }

    public String getWork_index() {
        return work_index;
    }

    public void setWork_index(String work_index) {
        this.work_index = work_index;
    }

    public String getMoney_index() {
        return money_index;
    }

    public void setMoney_index(String money_index) {
        this.money_index = money_index;
    }

    public String getGeneral_txt() {
        return general_txt;
    }

    public void setGeneral_txt(String general_txt) {
        this.general_txt = general_txt;
    }

    public String getOneword() {
        return oneword;
    }

    public void setOneword(String oneword) {
        this.oneword = oneword;
    }

    public String getGeneral_index() {
        return general_index;
    }

    public void setGeneral_index(String general_index) {
        this.general_index = general_index;
    }

    public String getLove_index() {
        return love_index;
    }

    public void setLove_index(String love_index) {
        this.love_index = love_index;
    }
}

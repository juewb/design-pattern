package com.design.pattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {


            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public QiTianDaSheng copy(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.height = target.height;
        qiTianDaSheng.weight = target.height;

        qiTianDaSheng.jinGuBang = new JinGuBang();
        qiTianDaSheng.jinGuBang.h = target.jinGuBang.h;
        qiTianDaSheng.jinGuBang.d = target.jinGuBang.d;

        qiTianDaSheng.birthday = new Date();
        return  qiTianDaSheng;
    }
}

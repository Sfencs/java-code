package com.sfencs.jc.builder;

/**
 * bulider模式创建对象，用来处理创建对象参数过多的问题
 */
public class People {
    private final int age;
    private final String name;
    private final String sex;
    private final String phone;
    private final String address;

    public static class Builder {
        //必要参数
        private final int age;
        private final String name;
        //非必须参数
        private String sex = "man";
        private String phone = "1213";
        private String address = "ccc";

        public Builder(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public People build() {
            return new People(this);
        }

    }

    public People(Builder builder) {
        address = builder.address;
        sex = builder.sex;
        age = builder.age;
        name = builder.name;
        phone = builder.phone;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        People people = new People.Builder(22, "Sfencs").address("xxx").phone("123456").sex("man").build();
        System.out.println(
                people.getSex() + " "
                        + people.getAddress()
                        + " " + people.getName()
                        + " " + people.getPhone()
                        + " " + people.getAge());
    }
}

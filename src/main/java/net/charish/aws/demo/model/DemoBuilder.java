package net.charish.aws.demo.model;

public final class DemoBuilder {

    private long id;
    private String name;

    private DemoBuilder() {
    }

    public static DemoBuilder aDemo() {
        return new DemoBuilder();
    }

    public DemoBuilder withId(long id) {
        this.id = id;
        return this;
    }

    public DemoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public Demo build() {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setName(name);
        return demo;
    }
}

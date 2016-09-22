package co.levee.cs2.uml;

import co.levee.cs2.util.ShortRandom;

import java.lang.reflect.*;

/**
 * Created by Dominic Moorman on 9/18/16.
 */
public class Description {
    private static final ShortRandom shortRandom = new ShortRandom();
    private String name;
    private String key;
    private String type;
    private String[] args;
    private boolean isPublic;
    private boolean isProtected;

    private boolean method;

    public Description(Member member) {
        key = shortRandom.shortRandom();
        this.name = member.getName();
        this.isPublic = Modifier.isPublic(member.getModifiers());
        this.isProtected = Modifier.isProtected(member.getModifiers());
    }

    public Description(Field field) {
        this((Member) field);
        this.type = field.getType().getSimpleName();
    }

    public Description(Constructor ctor) {
        this((Member) ctor);
        this.name = this.name.substring(this.name.lastIndexOf(".") + 1);
        this.type = ctor.getClass().getSimpleName();
        this.args = flatten(ctor.getParameterTypes());
        this.method = true;
    }

    public Description(Method method) {
        this((Member) method);
        this.type = method.getReturnType().getSimpleName();
        this.args = flatten(method.getParameterTypes());
        this.method = true;
    }

    private String[] flatten(Class[] params) {
        if (params.length < 1) {
            return null;
        }
        String[] buf = new String[params.length];
        for (int i = 0; i < params.length; i++) {
            buf[i] = params[i].getSimpleName();
        }
        return buf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public boolean isMethod() {
        return method;
    }

    public void setMethod(boolean method) {
        this.method = method;
    }
}

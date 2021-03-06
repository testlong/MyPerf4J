package cn.myperf4j.asm;

import cn.myperf4j.asm.aop.ProfilingTransformer;

import java.lang.instrument.Instrumentation;

/**
 * Created by LinShunkang on 2018/4/25
 */
public class PreMain {

    public static void premain(String options, Instrumentation ins) {
        ASMBootstrap.getInstance().initial();
        ins.addTransformer(new ProfilingTransformer());
    }

}

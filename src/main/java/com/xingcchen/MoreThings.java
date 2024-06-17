package com.xingcchen;

import com.xingcchen.item.MyRegister;
import com.xingcchen.world.gen.MyWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreThings implements ModInitializer {
	public static final String MOD_ID = "more-things";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		//随mod加载开始初始化
		MyRegister.registeritem();
		MyRegister.registerblock();
		MyRegister.registeritemgroup();
		MyWorldGeneration.generateModWorldGen();

	}
}
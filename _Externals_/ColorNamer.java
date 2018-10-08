package _Externals_;//Created by Ryan on 5/3/17.
import _Externals_._Resources_.ResourceGetter;

import java.awt.*;
import java.util.ArrayList;
public class ColorNamer
{
    //MODIFIED BY RYAN BURGERT: I ADDED ABOUT 3X AS MANY COLORS AND ADDED A STRING HEX-INPUT
    //THIS COMES FROM https://gist.github.com/XiaoxiaoLi/8031146
    //A PASTE OF HOW I CREATED ALL THESE COLORS CAN BE FOUND IN THE _DOCUMENTATION_ FOLDER
    /*
      Java Code to get a color name from rgb/hex value/awt color

      The part of looking up a color name from the rgb values is edited from
      https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)

      @author Xiaoxiao Li

     */
    /**
     * Initialize the color list that we have.
     */
    private static ArrayList<ColorName> initColorList()
    {
        ArrayList<ColorName> colorList=new ArrayList<>();
        colorList.add(new ColorName(ResourceGetter.getProperty("dry.grey"),0x00,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("navy"),0x00,0x00,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("testy.blue"),0x00,0x00,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("mere.blue"),0x00,0x00,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("ancient.blue"),0x00,0x00,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("cool.blue"),0x00,0x00,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.green"),0x00,0x64,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("black.and.white.deep.sky.blue"),0x00,0x68,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("green"),0x00,0x80,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("teal"),0x00,0x80,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("sick.turquoise"),0x00,0x86,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("plastic.green"),0x00,0x8B,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("highfalutin.spring.green"),0x00,0x8B,0x45));
        colorList.add(new ColorName(ResourceGetter.getProperty("glib.cyan"),0x00,0x8B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("brawny.deep.sky.blue"),0x00,0x9A,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("elfin.deep.sky.blue"),0x00,0xB2,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("periodic.deep.sky.blue"),0x00,0xBF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("decorous.turquoise"),0x00,0xC5,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("nonstop.green"),0x00,0xCD,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("merciful.spring.green"),0x00,0xCD,0x66));
        colorList.add(new ColorName(ResourceGetter.getProperty("fair.cyan"),0x00,0xCD,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.turquoise"),0x00,0xCE,0xD1));
        colorList.add(new ColorName(ResourceGetter.getProperty("scientific.turquoise"),0x00,0xE5,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("stale.green"),0x00,0xEE,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("sturdy.spring.green"),0x00,0xEE,0x76));
        colorList.add(new ColorName(ResourceGetter.getProperty("boring.cyan"),0x00,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("handsome.turquoise"),0x00,0xF5,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.spring.green"),0x00,0xFA,0x9A));
        colorList.add(new ColorName(ResourceGetter.getProperty("condemned.green"),0x00,0xFF,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("vague.spring.green"),0x00,0xFF,0x7F));
        colorList.add(new ColorName(ResourceGetter.getProperty("adjoining.cyan"),0x00,0xFF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("towering.grey"),0x03,0x03,0x03));
        colorList.add(new ColorName(ResourceGetter.getProperty("amused.grey"),0x05,0x05,0x05));
        colorList.add(new ColorName(ResourceGetter.getProperty("used.grey"),0x08,0x08,0x08));
        colorList.add(new ColorName(ResourceGetter.getProperty("instinctive.grey"),0x0A,0x0A,0x0A));
        colorList.add(new ColorName(ResourceGetter.getProperty("good.grey"),0x0D,0x0D,0x0D));
        colorList.add(new ColorName(ResourceGetter.getProperty("accessible.grey"),0x0F,0x0F,0x0F));
        colorList.add(new ColorName(ResourceGetter.getProperty("womanly.dodger.blue"),0x10,0x4E,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("obscene.grey"),0x12,0x12,0x12));
        colorList.add(new ColorName(ResourceGetter.getProperty("jealous.grey"),0x14,0x14,0x14));
        colorList.add(new ColorName(ResourceGetter.getProperty("moldy.grey"),0x17,0x17,0x17));
        colorList.add(new ColorName(ResourceGetter.getProperty("mellow.dodger.blue"),0x18,0x74,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("midnight.blue"),0x19,0x19,0x70));
        colorList.add(new ColorName(ResourceGetter.getProperty("immense.grey"),0x1A,0x1A,0x1A));
        colorList.add(new ColorName(ResourceGetter.getProperty("testy.grey"),0x1C,0x1C,0x1C));
        colorList.add(new ColorName(ResourceGetter.getProperty("womanly.dodger.blue"),0x1C,0x86,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("overjoyed.dodger.blue"),0x1E,0x90,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("tranquil.grey"),0x1F,0x1F,0x1F));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.sea.green"),0x20,0xB2,0xAA));
        colorList.add(new ColorName(ResourceGetter.getProperty("materialistic.grey"),0x21,0x21,0x21));
        colorList.add(new ColorName(ResourceGetter.getProperty("forest.green"),0x22,0x8B,0x22));
        colorList.add(new ColorName(ResourceGetter.getProperty("instinctive.grey"),0x24,0x24,0x24));
        colorList.add(new ColorName(ResourceGetter.getProperty("curious.grey"),0x26,0x26,0x26));
        colorList.add(new ColorName(ResourceGetter.getProperty("general.royal.blue"),0x27,0x40,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("gabby.grey"),0x29,0x29,0x29));
        colorList.add(new ColorName(ResourceGetter.getProperty("steep.grey"),0x2B,0x2B,0x2B));
        colorList.add(new ColorName(ResourceGetter.getProperty("somber.grey"),0x2E,0x2E,0x2E));
        colorList.add(new ColorName(ResourceGetter.getProperty("exotic.sea.green"),0x2E,0x8B,0x57));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.slate.grey"),0x2F,0x4F,0x4F));
        colorList.add(new ColorName(ResourceGetter.getProperty("periodic.grey"),0x30,0x30,0x30));
        colorList.add(new ColorName(ResourceGetter.getProperty("lime.green"),0x32,0xCD,0x32));
        colorList.add(new ColorName(ResourceGetter.getProperty("opposite.grey"),0x33,0x33,0x33));
        colorList.add(new ColorName(ResourceGetter.getProperty("yummy.grey"),0x36,0x36,0x36));
        colorList.add(new ColorName(ResourceGetter.getProperty("mellow.steel.blue"),0x36,0x64,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("panoramic.grey"),0x38,0x38,0x38));
        colorList.add(new ColorName(ResourceGetter.getProperty("fast.royal.blue"),0x3A,0x5F,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("general.grey"),0x3B,0x3B,0x3B));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.sea.green"),0x3C,0xB3,0x71));
        colorList.add(new ColorName(ResourceGetter.getProperty("yummy.grey"),0x3D,0x3D,0x3D));
        colorList.add(new ColorName(ResourceGetter.getProperty("secretive.grey"),0x40,0x40,0x40));
        colorList.add(new ColorName(ResourceGetter.getProperty("turquoise"),0x40,0xE0,0xD0));
        colorList.add(new ColorName(ResourceGetter.getProperty("royal.blue"),0x41,0x69,0xE1));
        colorList.add(new ColorName(ResourceGetter.getProperty("majestic.grey"),0x42,0x42,0x42));
        colorList.add(new ColorName(ResourceGetter.getProperty("highfalutin.royal.blue"),0x43,0x6E,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("woozy.sea.green"),0x43,0xCD,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("flawless.grey"),0x45,0x45,0x45));
        colorList.add(new ColorName(ResourceGetter.getProperty("lively.chartreuse"),0x45,0x8B,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("trite.aquamarine"),0x45,0x8B,0x74));
        colorList.add(new ColorName(ResourceGetter.getProperty("steel.blue"),0x46,0x82,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("useful.slate.blue"),0x47,0x3C,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("deserted.grey"),0x47,0x47,0x47));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.slate.blue"),0x48,0x3D,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("clear.royal.blue"),0x48,0x76,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.turquoise"),0x48,0xD1,0xCC));
        colorList.add(new ColorName(ResourceGetter.getProperty("loud.grey"),0x4A,0x4A,0x4A));
        colorList.add(new ColorName(ResourceGetter.getProperty("squalid.sky.blue"),0x4A,0x70,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("indigo"),0x4B,0x00,0x82));
        colorList.add(new ColorName(ResourceGetter.getProperty("fast.grey"),0x4D,0x4D,0x4D));
        colorList.add(new ColorName(ResourceGetter.getProperty("ready.sea.green"),0x4E,0xEE,0x94));
        colorList.add(new ColorName(ResourceGetter.getProperty("zealous.grey"),0x4F,0x4F,0x4F));
        colorList.add(new ColorName(ResourceGetter.getProperty("frightening.steel.blue"),0x4F,0x94,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("high.pitched.grey"),0x52,0x52,0x52));
        colorList.add(new ColorName(ResourceGetter.getProperty("instinctive.dark.slate.gray"),0x52,0x8B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("historical.cadet.blue"),0x53,0x86,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("overt.grey"),0x54,0x54,0x54));
        colorList.add(new ColorName(ResourceGetter.getProperty("cruel.pale.green"),0x54,0x8B,0x54));
        colorList.add(new ColorName(ResourceGetter.getProperty("efficient.sea.green"),0x54,0xFF,0x9F));
        colorList.add(new ColorName(ResourceGetter.getProperty("hissing.purple"),0x55,0x1A,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.olive.green"),0x55,0x6B,0x2F));
        colorList.add(new ColorName(ResourceGetter.getProperty("present.grey"),0x57,0x57,0x57));
        colorList.add(new ColorName(ResourceGetter.getProperty("windy.grey"),0x59,0x59,0x59));
        colorList.add(new ColorName(ResourceGetter.getProperty("secretive.grey"),0x5C,0x5C,0x5C));
        colorList.add(new ColorName(ResourceGetter.getProperty("grateful.steel.blue"),0x5C,0xAC,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("huge.medium.purple"),0x5D,0x47,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("normal.grey"),0x5E,0x5E,0x5E));
        colorList.add(new ColorName(ResourceGetter.getProperty("cadet.blue"),0x5F,0x9E,0xA0));
        colorList.add(new ColorName(ResourceGetter.getProperty("bloody.light.sky.blue"),0x60,0x7B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("cool.grey"),0x61,0x61,0x61));
        colorList.add(new ColorName(ResourceGetter.getProperty("known.grey"),0x63,0x63,0x63));
        colorList.add(new ColorName(ResourceGetter.getProperty("obscene.steel.blue"),0x63,0xB8,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("cornflower.blue"),0x64,0x95,0xED));
        colorList.add(new ColorName(ResourceGetter.getProperty("rebecca.purple"),0x66,0x33,0x99));
        colorList.add(new ColorName(ResourceGetter.getProperty("chilly.grey"),0x66,0x66,0x66));
        colorList.add(new ColorName(ResourceGetter.getProperty("glistening.pale.turquoise"),0x66,0x8B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("swanky.chartreuse"),0x66,0xCD,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("quiet.aquamarine"),0x66,0xCD,0xAA));
        colorList.add(new ColorName(ResourceGetter.getProperty("quaint.dark.orchid"),0x68,0x22,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("bitter.light.blue"),0x68,0x83,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("gainful.slate.blue"),0x69,0x59,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("taboo.grey"),0x69,0x69,0x69));
        colorList.add(new ColorName(ResourceGetter.getProperty("macabre.olive.drab"),0x69,0x8B,0x22));
        colorList.add(new ColorName(ResourceGetter.getProperty("faulty.dark.sea.green"),0x69,0x8B,0x69));
        colorList.add(new ColorName(ResourceGetter.getProperty("slate.blue"),0x6A,0x5A,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("huge.grey"),0x6B,0x6B,0x6B));
        colorList.add(new ColorName(ResourceGetter.getProperty("olive.drab"),0x6B,0x8E,0x23));
        colorList.add(new ColorName(ResourceGetter.getProperty("nappy.slate.gray"),0x6C,0x7B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("vague.sky.blue"),0x6C,0xA6,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("recondite.grey"),0x6E,0x6E,0x6E));
        colorList.add(new ColorName(ResourceGetter.getProperty("one.light.steel.blue"),0x6E,0x7B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("enormous.dark.olive.green"),0x6E,0x8B,0x3D));
        colorList.add(new ColorName(ResourceGetter.getProperty("dynamic.grey"),0x70,0x70,0x70));
        colorList.add(new ColorName(ResourceGetter.getProperty("slate.grey"),0x70,0x80,0x90));
        colorList.add(new ColorName(ResourceGetter.getProperty("quirky.grey"),0x73,0x73,0x73));
        colorList.add(new ColorName(ResourceGetter.getProperty("enormous.grey"),0x75,0x75,0x75));
        colorList.add(new ColorName(ResourceGetter.getProperty("overt.chartreuse"),0x76,0xEE,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("normal.aquamarine"),0x76,0xEE,0xC6));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.slate.grey"),0x77,0x88,0x99));
        colorList.add(new ColorName(ResourceGetter.getProperty("strange.grey"),0x78,0x78,0x78));
        colorList.add(new ColorName(ResourceGetter.getProperty("long.term.dark.slate.gray"),0x79,0xCD,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("powerful.medium.orchid"),0x7A,0x37,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("kindly.slate.blue"),0x7A,0x67,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("faded.grey"),0x7A,0x7A,0x7A));
        colorList.add(new ColorName(ResourceGetter.getProperty("dependent.light.cyan"),0x7A,0x8B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("worried.cadet.blue"),0x7A,0xC5,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.slate.blue"),0x7B,0x68,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("sweltering.pale.green"),0x7C,0xCD,0x7C));
        colorList.add(new ColorName(ResourceGetter.getProperty("lawn.green"),0x7C,0xFC,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("obtainable.purple"),0x7D,0x26,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("dusty.grey"),0x7D,0x7D,0x7D));
        colorList.add(new ColorName(ResourceGetter.getProperty("flat.sky.blue"),0x7E,0xC0,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("web.maroon"),0x7F,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("web.purple"),0x7F,0x00,0x7F));
        colorList.add(new ColorName(ResourceGetter.getProperty("alcoholic.grey"),0x7F,0x7F,0x7F));
        colorList.add(new ColorName(ResourceGetter.getProperty("wooden.chartreuse"),0x7F,0xFF,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("awake.aquamarine"),0x7F,0xFF,0xD4));
        colorList.add(new ColorName(ResourceGetter.getProperty("maroon"),0x80,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("purple"),0x80,0x00,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("olive"),0x80,0x80,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("gray"),0x80,0x80,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("instinctive.grey"),0x82,0x82,0x82));
        colorList.add(new ColorName(ResourceGetter.getProperty("tiny.slate.blue"),0x83,0x6F,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("decorous.honeydew"),0x83,0x8B,0x83));
        colorList.add(new ColorName(ResourceGetter.getProperty("conscious.azure"),0x83,0x8B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.slate.blue"),0x84,0x70,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("towering.grey"),0x85,0x85,0x85));
        colorList.add(new ColorName(ResourceGetter.getProperty("squealing.grey"),0x87,0x87,0x87));
        colorList.add(new ColorName(ResourceGetter.getProperty("sky.blue"),0x87,0xCE,0xEB));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.sky.blue"),0x87,0xCE,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("willing.sky.blue"),0x87,0xCE,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("curved.medium.purple"),0x89,0x68,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("blue.violet"),0x8A,0x2B,0xE2));
        colorList.add(new ColorName(ResourceGetter.getProperty("godly.grey"),0x8A,0x8A,0x8A));
        colorList.add(new ColorName(ResourceGetter.getProperty("chilly.red"),0x8B,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("exclusive.magenta"),0x8B,0x00,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("guttural.deep.pink"),0x8B,0x0A,0x50));
        colorList.add(new ColorName(ResourceGetter.getProperty("cloistered.firebrick"),0x8B,0x1A,0x1A));
        colorList.add(new ColorName(ResourceGetter.getProperty("scientific.maroon"),0x8B,0x1C,0x62));
        colorList.add(new ColorName(ResourceGetter.getProperty("long.term.violet.red"),0x8B,0x22,0x52));
        colorList.add(new ColorName(ResourceGetter.getProperty("nappy.brown"),0x8B,0x23,0x23));
        colorList.add(new ColorName(ResourceGetter.getProperty("taboo.orange.red"),0x8B,0x25,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("wholesale.tomato"),0x8B,0x36,0x26));
        colorList.add(new ColorName(ResourceGetter.getProperty("tart.indian.red"),0x8B,0x3A,0x3A));
        colorList.add(new ColorName(ResourceGetter.getProperty("unwritten.hot.pink"),0x8B,0x3A,0x62));
        colorList.add(new ColorName(ResourceGetter.getProperty("overwrought.coral"),0x8B,0x3E,0x2F));
        colorList.add(new ColorName(ResourceGetter.getProperty("adaptable.dark.orange"),0x8B,0x45,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("narrow.chocolate"),0x8B,0x45,0x13));
        colorList.add(new ColorName(ResourceGetter.getProperty("zippy.sienna"),0x8B,0x47,0x26));
        colorList.add(new ColorName(ResourceGetter.getProperty("cultured.pale.violet.red"),0x8B,0x47,0x5D));
        colorList.add(new ColorName(ResourceGetter.getProperty("flippant.orchid"),0x8B,0x47,0x89));
        colorList.add(new ColorName(ResourceGetter.getProperty("ambitious.salmon"),0x8B,0x4C,0x39));
        colorList.add(new ColorName(ResourceGetter.getProperty("green.light.salmon"),0x8B,0x57,0x42));
        colorList.add(new ColorName(ResourceGetter.getProperty("dry.orange"),0x8B,0x5A,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("exclusive.tan"),0x8B,0x5A,0x2B));
        colorList.add(new ColorName(ResourceGetter.getProperty("quaint.light.pink"),0x8B,0x5F,0x65));
        colorList.add(new ColorName(ResourceGetter.getProperty("conscious.pink"),0x8B,0x63,0x6C));
        colorList.add(new ColorName(ResourceGetter.getProperty("careless.dark.goldenrod"),0x8B,0x65,0x08));
        colorList.add(new ColorName(ResourceGetter.getProperty("dirty.plum"),0x8B,0x66,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("telling.goldenrod"),0x8B,0x69,0x14));
        colorList.add(new ColorName(ResourceGetter.getProperty("polite.rosy.brown"),0x8B,0x69,0x69));
        colorList.add(new ColorName(ResourceGetter.getProperty("zippy.burlywood"),0x8B,0x73,0x55));
        colorList.add(new ColorName(ResourceGetter.getProperty("brown.gold"),0x8B,0x75,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("deranged.peach.puff"),0x8B,0x77,0x65));
        colorList.add(new ColorName(ResourceGetter.getProperty("towering.navajo.white"),0x8B,0x79,0x5E));
        colorList.add(new ColorName(ResourceGetter.getProperty("known.thistle"),0x8B,0x7B,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("outstanding.bisque"),0x8B,0x7D,0x6B));
        colorList.add(new ColorName(ResourceGetter.getProperty("waggish.misty.rose"),0x8B,0x7D,0x7B));
        colorList.add(new ColorName(ResourceGetter.getProperty("overjoyed.wheat"),0x8B,0x7E,0x66));
        colorList.add(new ColorName(ResourceGetter.getProperty("invincible.light.goldenrod"),0x8B,0x81,0x4C));
        colorList.add(new ColorName(ResourceGetter.getProperty("statuesque.antique.white"),0x8B,0x83,0x78));
        colorList.add(new ColorName(ResourceGetter.getProperty("uncovered.lavender.blush"),0x8B,0x83,0x86));
        colorList.add(new ColorName(ResourceGetter.getProperty("luxuriant.khaki"),0x8B,0x86,0x4E));
        colorList.add(new ColorName(ResourceGetter.getProperty("delicate.seashell"),0x8B,0x86,0x82));
        colorList.add(new ColorName(ResourceGetter.getProperty("wholesale.cornsilk"),0x8B,0x88,0x78));
        colorList.add(new ColorName(ResourceGetter.getProperty("gabby.lemon.chiffon"),0x8B,0x89,0x70));
        colorList.add(new ColorName(ResourceGetter.getProperty("squealing.snow"),0x8B,0x89,0x89));
        colorList.add(new ColorName(ResourceGetter.getProperty("unused.yellow"),0x8B,0x8B,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("tricky.light.yellow"),0x8B,0x8B,0x7A));
        colorList.add(new ColorName(ResourceGetter.getProperty("elite.ivory"),0x8B,0x8B,0x83));
        colorList.add(new ColorName(ResourceGetter.getProperty("lethal.grey"),0x8C,0x8C,0x8C));
        colorList.add(new ColorName(ResourceGetter.getProperty("narrow.light.sky.blue"),0x8D,0xB6,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("attractive.dark.slate.gray"),0x8D,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("robust.cadet.blue"),0x8E,0xE5,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("graceful.grey"),0x8F,0x8F,0x8F));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.sea.green"),0x8F,0xBC,0x8F));
        colorList.add(new ColorName(ResourceGetter.getProperty("yummy.pale.green"),0x90,0xEE,0x90));
        colorList.add(new ColorName(ResourceGetter.getProperty("scientific.purple"),0x91,0x2C,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("sneaky.grey"),0x91,0x91,0x91));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.purple"),0x93,0x70,0xDB));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.violet"),0x94,0x00,0xD3));
        colorList.add(new ColorName(ResourceGetter.getProperty("tired.grey"),0x94,0x94,0x94));
        colorList.add(new ColorName(ResourceGetter.getProperty("fast.grey"),0x96,0x96,0x96));
        colorList.add(new ColorName(ResourceGetter.getProperty("depressed.pale.turquoise"),0x96,0xCD,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("furtive.dark.slate.gray"),0x97,0xFF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("present.cadet.blue"),0x98,0xF5,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("pale.green"),0x98,0xFB,0x98));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.orchid"),0x99,0x32,0xCC));
        colorList.add(new ColorName(ResourceGetter.getProperty("long.term.grey"),0x99,0x99,0x99));
        colorList.add(new ColorName(ResourceGetter.getProperty("scientific.dark.orchid"),0x9A,0x32,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("uncovered.light.blue"),0x9A,0xC0,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("yellow.green"),0x9A,0xCD,0x32));
        colorList.add(new ColorName(ResourceGetter.getProperty("scrawny.pale.green"),0x9A,0xFF,0x9A));
        colorList.add(new ColorName(ResourceGetter.getProperty("nippy.purple"),0x9B,0x30,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("wholesale.dark.sea.green"),0x9B,0xCD,0x9B));
        colorList.add(new ColorName(ResourceGetter.getProperty("smoggy.grey"),0x9C,0x9C,0x9C));
        colorList.add(new ColorName(ResourceGetter.getProperty("green.grey"),0x9E,0x9E,0x9E));
        colorList.add(new ColorName(ResourceGetter.getProperty("joyous.medium.purple"),0x9F,0x79,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("brave.slate.gray"),0x9F,0xB6,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("purple"),0xA0,0x20,0xF0));
        colorList.add(new ColorName(ResourceGetter.getProperty("sienna"),0xA0,0x52,0x2D));
        colorList.add(new ColorName(ResourceGetter.getProperty("mundane.grey"),0xA1,0xA1,0xA1));
        colorList.add(new ColorName(ResourceGetter.getProperty("exclusive.light.steel.blue"),0xA2,0xB5,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("debonair.dark.olive.green"),0xA2,0xCD,0x5A));
        colorList.add(new ColorName(ResourceGetter.getProperty("awake.grey"),0xA3,0xA3,0xA3));
        colorList.add(new ColorName(ResourceGetter.getProperty("defective.light.sky.blue"),0xA4,0xD3,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("brown"),0xA5,0x2A,0x2A));
        colorList.add(new ColorName(ResourceGetter.getProperty("omniscient.grey"),0xA6,0xA6,0xA6));
        colorList.add(new ColorName(ResourceGetter.getProperty("jealous.grey"),0xA8,0xA8,0xA8));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.gray"),0xA9,0xA9,0xA9));
        colorList.add(new ColorName(ResourceGetter.getProperty("huge.medium.purple"),0xAB,0x82,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("aware.grey"),0xAB,0xAB,0xAB));
        colorList.add(new ColorName(ResourceGetter.getProperty("tiny.grey"),0xAD,0xAD,0xAD));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.blue"),0xAD,0xD8,0xE6));
        colorList.add(new ColorName(ResourceGetter.getProperty("green.yellow"),0xAD,0xFF,0x2F));
        colorList.add(new ColorName(ResourceGetter.getProperty("dazzling.pale.turquoise"),0xAE,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("pale.turquoise"),0xAF,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("maroon"),0xB0,0x30,0x60));
        colorList.add(new ColorName(ResourceGetter.getProperty("nosy.grey"),0xB0,0xB0,0xB0));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.steel.blue"),0xB0,0xC4,0xDE));
        colorList.add(new ColorName(ResourceGetter.getProperty("powder.blue"),0xB0,0xE0,0xE6));
        colorList.add(new ColorName(ResourceGetter.getProperty("jaded.light.sky.blue"),0xB0,0xE2,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("firebrick"),0xB2,0x22,0x22));
        colorList.add(new ColorName(ResourceGetter.getProperty("ambitious.dark.orchid"),0xB2,0x3A,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("known.light.blue"),0xB2,0xDF,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("didactic.grey"),0xB3,0xB3,0xB3));
        colorList.add(new ColorName(ResourceGetter.getProperty("languid.olive.drab"),0xB3,0xEE,0x3A));
        colorList.add(new ColorName(ResourceGetter.getProperty("amuck.medium.orchid"),0xB4,0x52,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("nine.light.cyan"),0xB4,0xCD,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("furry.dark.sea.green"),0xB4,0xEE,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("defective.grey"),0xB5,0xB5,0xB5));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.goldenrod"),0xB8,0x86,0x0B));
        colorList.add(new ColorName(ResourceGetter.getProperty("gainful.grey"),0xB8,0xB8,0xB8));
        colorList.add(new ColorName(ResourceGetter.getProperty("malicious.slate.gray"),0xB9,0xD3,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.orchid"),0xBA,0x55,0xD3));
        colorList.add(new ColorName(ResourceGetter.getProperty("private.grey"),0xBA,0xBA,0xBA));
        colorList.add(new ColorName(ResourceGetter.getProperty("dirty.pale.turquoise"),0xBB,0xFF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("rosy.brown"),0xBC,0x8F,0x8F));
        colorList.add(new ColorName(ResourceGetter.getProperty("hissing.light.steel.blue"),0xBC,0xD2,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("puzzling.dark.olive.green"),0xBC,0xEE,0x68));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.khaki"),0xBD,0xB7,0x6B));
        colorList.add(new ColorName(ResourceGetter.getProperty("alcoholic.grey"),0xBD,0xBD,0xBD));
        colorList.add(new ColorName(ResourceGetter.getProperty("grey"),0xBE,0xBE,0xBE));
        colorList.add(new ColorName(ResourceGetter.getProperty("depressed.dark.orchid"),0xBF,0x3E,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("clever.grey"),0xBF,0xBF,0xBF));
        colorList.add(new ColorName(ResourceGetter.getProperty("ablaze.light.blue"),0xBF,0xEF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("silver"),0xC0,0xC0,0xC0));
        colorList.add(new ColorName(ResourceGetter.getProperty("wooden.olive.drab"),0xC0,0xFF,0x3E));
        colorList.add(new ColorName(ResourceGetter.getProperty("mere.honeydew"),0xC1,0xCD,0xC1));
        colorList.add(new ColorName(ResourceGetter.getProperty("cultured.azure"),0xC1,0xCD,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("fair.dark.sea.green"),0xC1,0xFF,0xC1));
        colorList.add(new ColorName(ResourceGetter.getProperty("efficient.grey"),0xC2,0xC2,0xC2));
        colorList.add(new ColorName(ResourceGetter.getProperty("tart.grey"),0xC4,0xC4,0xC4));
        colorList.add(new ColorName(ResourceGetter.getProperty("feigned.slate.gray"),0xC6,0xE2,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("medium.violet.red"),0xC7,0x15,0x85));
        colorList.add(new ColorName(ResourceGetter.getProperty("glib.grey"),0xC7,0xC7,0xC7));
        colorList.add(new ColorName(ResourceGetter.getProperty("redundant.grey"),0xC9,0xC9,0xC9));
        colorList.add(new ColorName(ResourceGetter.getProperty("faded.light.steel.blue"),0xCA,0xE1,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("used.dark.olive.green"),0xCA,0xFF,0x70));
        colorList.add(new ColorName(ResourceGetter.getProperty("orange.grey"),0xCC,0xCC,0xCC));
        colorList.add(new ColorName(ResourceGetter.getProperty("statuesque.red"),0xCD,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("fresh.magenta"),0xCD,0x00,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("womanly.deep.pink"),0xCD,0x10,0x76));
        colorList.add(new ColorName(ResourceGetter.getProperty("sweltering.firebrick"),0xCD,0x26,0x26));
        colorList.add(new ColorName(ResourceGetter.getProperty("quiet.maroon"),0xCD,0x29,0x90));
        colorList.add(new ColorName(ResourceGetter.getProperty("sophisticated.violet.red"),0xCD,0x32,0x78));
        colorList.add(new ColorName(ResourceGetter.getProperty("swanky.brown"),0xCD,0x33,0x33));
        colorList.add(new ColorName(ResourceGetter.getProperty("brave.orange.red"),0xCD,0x37,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("obtainable.tomato"),0xCD,0x4F,0x39));
        colorList.add(new ColorName(ResourceGetter.getProperty("adhesive.indian.red"),0xCD,0x55,0x55));
        colorList.add(new ColorName(ResourceGetter.getProperty("muddled.coral"),0xCD,0x5B,0x45));
        colorList.add(new ColorName(ResourceGetter.getProperty("indian.red"),0xCD,0x5C,0x5C));
        colorList.add(new ColorName(ResourceGetter.getProperty("bashful.hot.pink"),0xCD,0x60,0x90));
        colorList.add(new ColorName(ResourceGetter.getProperty("materialistic.dark.orange"),0xCD,0x66,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("vast.chocolate"),0xCD,0x66,0x1D));
        colorList.add(new ColorName(ResourceGetter.getProperty("ill.informed.sienna"),0xCD,0x68,0x39));
        colorList.add(new ColorName(ResourceGetter.getProperty("periodic.pale.violet.red"),0xCD,0x68,0x89));
        colorList.add(new ColorName(ResourceGetter.getProperty("frightened.orchid"),0xCD,0x69,0xC9));
        colorList.add(new ColorName(ResourceGetter.getProperty("plain.salmon"),0xCD,0x70,0x54));
        colorList.add(new ColorName(ResourceGetter.getProperty("wholesale.light.salmon"),0xCD,0x81,0x62));
        colorList.add(new ColorName(ResourceGetter.getProperty("outstanding.orange"),0xCD,0x85,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("deranged.tan"),0xCD,0x85,0x3F));
        colorList.add(new ColorName(ResourceGetter.getProperty("cute.light.pink"),0xCD,0x8C,0x95));
        colorList.add(new ColorName(ResourceGetter.getProperty("opposite.pink"),0xCD,0x91,0x9E));
        colorList.add(new ColorName(ResourceGetter.getProperty("mundane.dark.goldenrod"),0xCD,0x95,0x0C));
        colorList.add(new ColorName(ResourceGetter.getProperty("wholesale.plum"),0xCD,0x96,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("irritating.goldenrod"),0xCD,0x9B,0x1D));
        colorList.add(new ColorName(ResourceGetter.getProperty("feigned.rosy.brown"),0xCD,0x9B,0x9B));
        colorList.add(new ColorName(ResourceGetter.getProperty("puzzling.burlywood"),0xCD,0xAA,0x7D));
        colorList.add(new ColorName(ResourceGetter.getProperty("incompetent.gold"),0xCD,0xAD,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("evanescent.peach.puff"),0xCD,0xAF,0x95));
        colorList.add(new ColorName(ResourceGetter.getProperty("mellow.navajo.white"),0xCD,0xB3,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("historical.thistle"),0xCD,0xB5,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("gaudy.bisque"),0xCD,0xB7,0x9E));
        colorList.add(new ColorName(ResourceGetter.getProperty("succinct.misty.rose"),0xCD,0xB7,0xB5));
        colorList.add(new ColorName(ResourceGetter.getProperty("merciful.wheat"),0xCD,0xBA,0x96));
        colorList.add(new ColorName(ResourceGetter.getProperty("great.light.goldenrod"),0xCD,0xBE,0x70));
        colorList.add(new ColorName(ResourceGetter.getProperty("fresh.antique.white"),0xCD,0xC0,0xB0));
        colorList.add(new ColorName(ResourceGetter.getProperty("stale.lavender.blush"),0xCD,0xC1,0xC5));
        colorList.add(new ColorName(ResourceGetter.getProperty("ordinary.seashell"),0xCD,0xC5,0xBF));
        colorList.add(new ColorName(ResourceGetter.getProperty("rhetorical.khaki"),0xCD,0xC6,0x73));
        colorList.add(new ColorName(ResourceGetter.getProperty("orange.cornsilk"),0xCD,0xC8,0xB1));
        colorList.add(new ColorName(ResourceGetter.getProperty("mellow.lemon.chiffon"),0xCD,0xC9,0xA5));
        colorList.add(new ColorName(ResourceGetter.getProperty("dependent.snow"),0xCD,0xC9,0xC9));
        colorList.add(new ColorName(ResourceGetter.getProperty("screeching.yellow"),0xCD,0xCD,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("pathetic.light.yellow"),0xCD,0xCD,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("overwrought.ivory"),0xCD,0xCD,0xC1));
        colorList.add(new ColorName(ResourceGetter.getProperty("uncovered.grey"),0xCF,0xCF,0xCF));
        colorList.add(new ColorName(ResourceGetter.getProperty("violet.red"),0xD0,0x20,0x90));
        colorList.add(new ColorName(ResourceGetter.getProperty("vague.medium.orchid"),0xD1,0x5F,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("macabre.grey"),0xD1,0xD1,0xD1));
        colorList.add(new ColorName(ResourceGetter.getProperty("deserted.light.cyan"),0xD1,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("chocolate"),0xD2,0x69,0x1E));
        colorList.add(new ColorName(ResourceGetter.getProperty("tan"),0xD2,0xB4,0x8C));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.grey"),0xD3,0xD3,0xD3));
        colorList.add(new ColorName(ResourceGetter.getProperty("sparkling.grey"),0xD4,0xD4,0xD4));
        colorList.add(new ColorName(ResourceGetter.getProperty("parched.grey"),0xD6,0xD6,0xD6));
        colorList.add(new ColorName(ResourceGetter.getProperty("thistle"),0xD8,0xBF,0xD8));
        colorList.add(new ColorName(ResourceGetter.getProperty("kaput.grey"),0xD9,0xD9,0xD9));
        colorList.add(new ColorName(ResourceGetter.getProperty("orchid"),0xDA,0x70,0xD6));
        colorList.add(new ColorName(ResourceGetter.getProperty("goldenrod"),0xDA,0xA5,0x20));
        colorList.add(new ColorName(ResourceGetter.getProperty("pale.violet.red"),0xDB,0x70,0x93));
        colorList.add(new ColorName(ResourceGetter.getProperty("cultured.grey"),0xDB,0xDB,0xDB));
        colorList.add(new ColorName(ResourceGetter.getProperty("crimson"),0xDC,0x14,0x3C));
        colorList.add(new ColorName(ResourceGetter.getProperty("gainsboro"),0xDC,0xDC,0xDC));
        colorList.add(new ColorName(ResourceGetter.getProperty("plum"),0xDD,0xA0,0xDD));
        colorList.add(new ColorName(ResourceGetter.getProperty("burlywood"),0xDE,0xB8,0x87));
        colorList.add(new ColorName(ResourceGetter.getProperty("dynamic.grey"),0xDE,0xDE,0xDE));
        colorList.add(new ColorName(ResourceGetter.getProperty("debonair.medium.orchid"),0xE0,0x66,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("rhetorical.grey"),0xE0,0xE0,0xE0));
        colorList.add(new ColorName(ResourceGetter.getProperty("slim.honeydew"),0xE0,0xEE,0xE0));
        colorList.add(new ColorName(ResourceGetter.getProperty("jittery.azure"),0xE0,0xEE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("womanly.light.cyan"),0xE0,0xFF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("waiting.grey"),0xE3,0xE3,0xE3));
        colorList.add(new ColorName(ResourceGetter.getProperty("nosy.grey"),0xE5,0xE5,0xE5));
        colorList.add(new ColorName(ResourceGetter.getProperty("lavender"),0xE6,0xE6,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("testy.grey"),0xE8,0xE8,0xE8));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.salmon"),0xE9,0x96,0x7A));
        colorList.add(new ColorName(ResourceGetter.getProperty("rebel.grey"),0xEB,0xEB,0xEB));
        colorList.add(new ColorName(ResourceGetter.getProperty("godly.grey"),0xED,0xED,0xED));
        colorList.add(new ColorName(ResourceGetter.getProperty("statuesque.red"),0xEE,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("waggish.magenta"),0xEE,0x00,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("breezy.deep.pink"),0xEE,0x12,0x89));
        colorList.add(new ColorName(ResourceGetter.getProperty("exotic.firebrick"),0xEE,0x2C,0x2C));
        colorList.add(new ColorName(ResourceGetter.getProperty("finicky.maroon"),0xEE,0x30,0xA7));
        colorList.add(new ColorName(ResourceGetter.getProperty("longing.violet.red"),0xEE,0x3A,0x8C));
        colorList.add(new ColorName(ResourceGetter.getProperty("careless.brown"),0xEE,0x3B,0x3B));
        colorList.add(new ColorName(ResourceGetter.getProperty("deserted.orange.red"),0xEE,0x40,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("scrawny.tomato"),0xEE,0x5C,0x42));
        colorList.add(new ColorName(ResourceGetter.getProperty("gainful.indian.red"),0xEE,0x63,0x63));
        colorList.add(new ColorName(ResourceGetter.getProperty("safe.coral"),0xEE,0x6A,0x50));
        colorList.add(new ColorName(ResourceGetter.getProperty("stupendous.hot.pink"),0xEE,0x6A,0xA7));
        colorList.add(new ColorName(ResourceGetter.getProperty("protective.dark.orange"),0xEE,0x76,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("dispensable.chocolate"),0xEE,0x76,0x21));
        colorList.add(new ColorName(ResourceGetter.getProperty("bitter.sienna"),0xEE,0x79,0x42));
        colorList.add(new ColorName(ResourceGetter.getProperty("afraid.pale.violet.red"),0xEE,0x79,0x9F));
        colorList.add(new ColorName(ResourceGetter.getProperty("impossible.orchid"),0xEE,0x7A,0xE9));
        colorList.add(new ColorName(ResourceGetter.getProperty("historical.salmon"),0xEE,0x82,0x62));
        colorList.add(new ColorName(ResourceGetter.getProperty("violet"),0xEE,0x82,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("responsible.light.salmon"),0xEE,0x95,0x72));
        colorList.add(new ColorName(ResourceGetter.getProperty("second.orange"),0xEE,0x9A,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("sincere.tan"),0xEE,0x9A,0x49));
        colorList.add(new ColorName(ResourceGetter.getProperty("highfalutin.light.pink"),0xEE,0xA2,0xAD));
        colorList.add(new ColorName(ResourceGetter.getProperty("hard.to.find.pink"),0xEE,0xA9,0xB8));
        colorList.add(new ColorName(ResourceGetter.getProperty("protective.dark.goldenrod"),0xEE,0xAD,0x0E));
        colorList.add(new ColorName(ResourceGetter.getProperty("earsplitting.plum"),0xEE,0xAE,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("empty.goldenrod"),0xEE,0xB4,0x22));
        colorList.add(new ColorName(ResourceGetter.getProperty("possible.rosy.brown"),0xEE,0xB4,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("royal.burlywood"),0xEE,0xC5,0x91));
        colorList.add(new ColorName(ResourceGetter.getProperty("panicky.gold"),0xEE,0xC9,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("defective.peach.puff"),0xEE,0xCB,0xAD));
        colorList.add(new ColorName(ResourceGetter.getProperty("ossified.navajo.white"),0xEE,0xCF,0xA1));
        colorList.add(new ColorName(ResourceGetter.getProperty("materialistic.thistle"),0xEE,0xD2,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("kaput.bisque"),0xEE,0xD5,0xB7));
        colorList.add(new ColorName(ResourceGetter.getProperty("synonymous.misty.rose"),0xEE,0xD5,0xD2));
        colorList.add(new ColorName(ResourceGetter.getProperty("graceful.wheat"),0xEE,0xD8,0xAE));
        colorList.add(new ColorName(ResourceGetter.getProperty("ready.light.goldenrod"),0xEE,0xDC,0x82));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.goldenrod"),0xEE,0xDD,0x82));
        colorList.add(new ColorName(ResourceGetter.getProperty("secretive.antique.white"),0xEE,0xDF,0xCC));
        colorList.add(new ColorName(ResourceGetter.getProperty("one.lavender.blush"),0xEE,0xE0,0xE5));
        colorList.add(new ColorName(ResourceGetter.getProperty("tiny.seashell"),0xEE,0xE5,0xDE));
        colorList.add(new ColorName(ResourceGetter.getProperty("good.khaki"),0xEE,0xE6,0x85));
        colorList.add(new ColorName(ResourceGetter.getProperty("pale.goldenrod"),0xEE,0xE8,0xAA));
        colorList.add(new ColorName(ResourceGetter.getProperty("fixed.cornsilk"),0xEE,0xE8,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("acidic.lemon.chiffon"),0xEE,0xE9,0xBF));
        colorList.add(new ColorName(ResourceGetter.getProperty("mature.snow"),0xEE,0xE9,0xE9));
        colorList.add(new ColorName(ResourceGetter.getProperty("blushing.yellow"),0xEE,0xEE,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("screeching.light.yellow"),0xEE,0xEE,0xD1));
        colorList.add(new ColorName(ResourceGetter.getProperty("animated.ivory"),0xEE,0xEE,0xE0));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.coral"),0xF0,0x80,0x80));
        colorList.add(new ColorName(ResourceGetter.getProperty("khaki"),0xF0,0xE6,0x8C));
        colorList.add(new ColorName(ResourceGetter.getProperty("snotty.grey"),0xF0,0xF0,0xF0));
        colorList.add(new ColorName(ResourceGetter.getProperty("alice.blue"),0xF0,0xF8,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("frantic.honeydew"),0xF0,0xFF,0xF0));
        colorList.add(new ColorName(ResourceGetter.getProperty("good.azure"),0xF0,0xFF,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("mere.grey"),0xF2,0xF2,0xF2));
        colorList.add(new ColorName(ResourceGetter.getProperty("sandy.brown"),0xF4,0xA4,0x60));
        colorList.add(new ColorName(ResourceGetter.getProperty("wheat"),0xF5,0xDE,0xB3));
        colorList.add(new ColorName(ResourceGetter.getProperty("beige"),0xF5,0xF5,0xDC));
        colorList.add(new ColorName(ResourceGetter.getProperty("white.smoke"),0xF5,0xF5,0xF5));
        colorList.add(new ColorName(ResourceGetter.getProperty("mint.cream"),0xF5,0xFF,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("stormy.grey"),0xF7,0xF7,0xF7));
        colorList.add(new ColorName(ResourceGetter.getProperty("ghost.white"),0xF8,0xF8,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("salmon"),0xFA,0x80,0x72));
        colorList.add(new ColorName(ResourceGetter.getProperty("antique.white"),0xFA,0xEB,0xD7));
        colorList.add(new ColorName(ResourceGetter.getProperty("linen"),0xFA,0xF0,0xE6));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.goldenrod.yellow"),0xFA,0xFA,0xD2));
        colorList.add(new ColorName(ResourceGetter.getProperty("worried.grey"),0xFA,0xFA,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("feeble.grey"),0xFC,0xFC,0xFC));
        colorList.add(new ColorName(ResourceGetter.getProperty("old.lace"),0xFD,0xF5,0xE6));
        colorList.add(new ColorName(ResourceGetter.getProperty("worried.red"),0xFF,0x00,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("longing.magenta"),0xFF,0x00,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("exotic.deep.pink"),0xFF,0x14,0x93));
        colorList.add(new ColorName(ResourceGetter.getProperty("private.firebrick"),0xFF,0x30,0x30));
        colorList.add(new ColorName(ResourceGetter.getProperty("conscious.maroon"),0xFF,0x34,0xB3));
        colorList.add(new ColorName(ResourceGetter.getProperty("known.violet.red"),0xFF,0x3E,0x96));
        colorList.add(new ColorName(ResourceGetter.getProperty("jittery.brown"),0xFF,0x40,0x40));
        colorList.add(new ColorName(ResourceGetter.getProperty("abiding.orange.red"),0xFF,0x45,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("unbecoming.tomato"),0xFF,0x63,0x47));
        colorList.add(new ColorName(ResourceGetter.getProperty("hot.pink"),0xFF,0x69,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("shocking.indian.red"),0xFF,0x6A,0x6A));
        colorList.add(new ColorName(ResourceGetter.getProperty("mundane.hot.pink"),0xFF,0x6E,0xB4));
        colorList.add(new ColorName(ResourceGetter.getProperty("merciful.coral"),0xFF,0x72,0x56));
        colorList.add(new ColorName(ResourceGetter.getProperty("outstanding.dark.orange"),0xFF,0x7F,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("minor.chocolate"),0xFF,0x7F,0x24));
        colorList.add(new ColorName(ResourceGetter.getProperty("coral"),0xFF,0x7F,0x50));
        colorList.add(new ColorName(ResourceGetter.getProperty("deafening.sienna"),0xFF,0x82,0x47));
        colorList.add(new ColorName(ResourceGetter.getProperty("fertile.pale.violet.red"),0xFF,0x82,0xAB));
        colorList.add(new ColorName(ResourceGetter.getProperty("woebegone.orchid"),0xFF,0x83,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("dark.orange"),0xFF,0x8C,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("staking.salmon"),0xFF,0x8C,0x69));
        colorList.add(new ColorName(ResourceGetter.getProperty("unknown.light.salmon"),0xFF,0xA0,0x7A));
        colorList.add(new ColorName(ResourceGetter.getProperty("dysfunctional.orange"),0xFF,0xA5,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("didactic.tan"),0xFF,0xA5,0x4F));
        colorList.add(new ColorName(ResourceGetter.getProperty("snotty.light.pink"),0xFF,0xAE,0xB9));
        colorList.add(new ColorName(ResourceGetter.getProperty("somber.pink"),0xFF,0xB5,0xC5));
        colorList.add(new ColorName(ResourceGetter.getProperty("light.pink"),0xFF,0xB6,0xC1));
        colorList.add(new ColorName(ResourceGetter.getProperty("malicious.dark.goldenrod"),0xFF,0xB9,0x0F));
        colorList.add(new ColorName(ResourceGetter.getProperty("vengeful.plum"),0xFF,0xBB,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("pink"),0xFF,0xC0,0xCB));
        colorList.add(new ColorName(ResourceGetter.getProperty("deserted.goldenrod"),0xFF,0xC1,0x25));
        colorList.add(new ColorName(ResourceGetter.getProperty("towering.rosy.brown"),0xFF,0xC1,0xC1));
        colorList.add(new ColorName(ResourceGetter.getProperty("blue.eyed.burlywood"),0xFF,0xD3,0x9B));
        colorList.add(new ColorName(ResourceGetter.getProperty("hateful.gold"),0xFF,0xD7,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("scrawny.peach.puff"),0xFF,0xDA,0xB9));
        colorList.add(new ColorName(ResourceGetter.getProperty("solid.navajo.white"),0xFF,0xDE,0xAD));
        colorList.add(new ColorName(ResourceGetter.getProperty("tangy.thistle"),0xFF,0xE1,0xFF));
        colorList.add(new ColorName(ResourceGetter.getProperty("moccasin"),0xFF,0xE4,0xB5));
        colorList.add(new ColorName(ResourceGetter.getProperty("royal.bisque"),0xFF,0xE4,0xC4));
        colorList.add(new ColorName(ResourceGetter.getProperty("graceful.misty.rose"),0xFF,0xE4,0xE1));
        colorList.add(new ColorName(ResourceGetter.getProperty("great.wheat"),0xFF,0xE7,0xBA));
        colorList.add(new ColorName(ResourceGetter.getProperty("blanched.almond"),0xFF,0xEB,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("sable.light.goldenrod"),0xFF,0xEC,0x8B));
        colorList.add(new ColorName(ResourceGetter.getProperty("papaya.whip"),0xFF,0xEF,0xD5));
        colorList.add(new ColorName(ResourceGetter.getProperty("loud.antique.white"),0xFF,0xEF,0xDB));
        colorList.add(new ColorName(ResourceGetter.getProperty("plucky.lavender.blush"),0xFF,0xF0,0xF5));
        colorList.add(new ColorName(ResourceGetter.getProperty("helpful.seashell"),0xFF,0xF5,0xEE));
        colorList.add(new ColorName(ResourceGetter.getProperty("zippy.khaki"),0xFF,0xF6,0x8F));
        colorList.add(new ColorName(ResourceGetter.getProperty("silly.cornsilk"),0xFF,0xF8,0xDC));
        colorList.add(new ColorName(ResourceGetter.getProperty("boundless.lemon.chiffon"),0xFF,0xFA,0xCD));
        colorList.add(new ColorName(ResourceGetter.getProperty("floral.white"),0xFF,0xFA,0xF0));
        colorList.add(new ColorName(ResourceGetter.getProperty("simplistic.snow"),0xFF,0xFA,0xFA));
        colorList.add(new ColorName(ResourceGetter.getProperty("pastoral.yellow"),0xFF,0xFF,0x00));
        colorList.add(new ColorName(ResourceGetter.getProperty("quirky.light.yellow"),0xFF,0xFF,0xE0));
        colorList.add(new ColorName(ResourceGetter.getProperty("dynamic.ivory"),0xFF,0xFF,0xF0));
        colorList.add(new ColorName(ResourceGetter.getProperty("white"),0xFF,0xFF,0xFF));
        return colorList;
    }
    /**
     * Get the closest color name from our list
     *
     * @param r
     * @param g
     * @param b
     * @return
     */
    public static String getColorNameFromRgb(int r,int g,int b)
    {
        ArrayList<ColorName> colorList=initColorList();
        ColorName closestMatch=null;
        int minMSE=Integer.MAX_VALUE;
        int mse;
        for(ColorName c : colorList)
        {
            mse=c.computeMSE(r,g,b);
            if(mse<minMSE)
            {
                minMSE=mse;
                closestMatch=c;
            }
        }
        if(closestMatch!=null)
        {
            return closestMatch.getName()+": "+String.format("#%02x%02x%02x",r,g,b).toUpperCase();
        }
        else
        {
            return ResourceGetter.getProperty("no.matched.color.name");
        }
    }
    /**
     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
     *
     * @param hexColor
     * @return
     */
    public static String getColorNameFromHex(int hexColor)
    {
        int r=(hexColor&0xFF0000)>>16;
        int g=(hexColor&0xFF00)>>8;
        int b=(hexColor&0xFF);
        return getColorNameFromRgb(r,g,b);
    }
    public static String hexWithOrWithoutHashtagFromColorName(String colorName)
    {
        //MUST ADAPT TO THE CONVENTION OF THIS CLASS'S OUTPUT FOR NAMES
        if(!colorName.contains("#"))
            return colorName;
        return colorName.split("#")[1];
    }
    public static String getColorNameFromHex(String hexColor)//In #RRGGBB Format
    {
        try
        {
            assert hexColor.charAt(0)=='#';
            assert hexColor.length()==7;//#AABBCC Has 7 characters
            return getColorNameFromHex(Integer.parseInt(hexColor.substring(1),16));
        }
        catch(Exception ignored)
        {
            System.out.println(hexColor);
            assert false;
            return null;
        }
    }
    private static int colorToHex(Color c)
    {
        return Integer.decode(ResourceGetter.getProperty("0x")+Integer.toHexString(c.getRGB()).substring(2));
    }
    private static String getColorNameFromColor(Color color)
    {
        return getColorNameFromRgb(color.getRed(),color.getGreen(),color.getBlue());
    }
    /**
     * SubClass of ColorUtils. In order to lookup color name
     *
     * @author Xiaoxiao Li
     */
    private static class ColorName
    {
        public int r, g, b;
        public String name;
        public ColorName(String name,int r,int g,int b)
        {
            this.r=r;
            this.g=g;
            this.b=b;
            this.name=name;
        }
        public int computeMSE(int pixR,int pixG,int pixB)
        {
            return ((pixR-r)*(pixR-r)+(pixG-g)*(pixG-g)+(pixB-b)*(pixB-b))/3;
        }
        public int getR()
        {
            return r;
        }
        public int getG()
        {
            return g;
        }
        public int getB()
        {
            return b;
        }
        public String getName()
        {
            return name;
        }
    }
    public static void main(String[] args)
    {
        //For testing purposes
        System.out.println(getColorNameFromHex(ResourceGetter.getProperty("00ff00")));
        System.out.println(getColorNameFromHex(ResourceGetter.getProperty("f4a442")));
    }
}

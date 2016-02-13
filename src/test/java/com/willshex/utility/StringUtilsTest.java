//
//  StringUtilsTest.java
//  com.willshex.utility
//
//  Created by William Shakour (billy1380) on 5 Oct 2013.
//  Copyright © 2013 WillShex Limited. All rights reserved.
//
package com.willshex.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.willshex.utility.StringUtils;

/**
 * @author billy1380
 * 
 */
public class StringUtilsTest {
	/**
	 * Test method for {@link com.willshex.utility.JsonUtils#cleanJson(java.lang.String)} .
	 */
	@Test
	public void rot13Test () {
		assertEquals("test", StringUtils.rot13(StringUtils.rot13("test")));

		assertEquals(
				"Yberz vcfhz qbybe fvg nzrg, pbafrpgrghe nqvcvfpvat ryvg. Cryyragrfdhr hean avfy, snhpvohf cbegn chehf rtrg, fbyyvpvghqva ynpvavn hean. Rgvnz fhfpvcvg whfgb sevatvyyn, ryrvsraq qhv frq, ryrvsraq bqvb. Qhvf aba zntan avfy. Ahyynz aba ravz ivgnr zntan nyvdhrg fpryrevfdhr ivgnr vq gbegbe. Znrpranf qncvohf iryvg ivgnr fpryrevfdhr pbainyyvf. Znhevf qbybe frz, grzcbe iry pbzzbqb n, ynpvavn arp ynphf. Ahyynz frq qvnz neph. Nrarna ardhr hean, ryrvsraq aba avfv hg, grzcbe fbqnyrf gbegbe. Shfpr cunergen, bepv np gvapvqhag znggvf, ahap dhnz fpryrevfdhr nhthr, fbyyvpvghqva srhtvng zntan gryyhf n ardhr. Phz fbpvvf angbdhr crangvohf rg zntavf qvf cneghevrag zbagrf, anfprghe evqvphyhf zhf. Cunfryyhf tenivqn beaner neph dhvf pbaqvzraghz. Shfpr fvg nzrg pbaqvzraghz zrghf.\n\nNrarna fntvggvf ahyyn fvg nzrg ahap snpvyvfvf, qncvohf phefhf reng pbafrpgrghe. Nrarna evfhf zntan, pbafrdhng frq ghecvf va, pbzzbqb pbafrpgrghe ryvg. Qhvf ryrvsraq bqvb vagreqhz bqvb nyvdhrg gevfgvdhr. Shfpr iry bqvb pbaqvzraghz, fbyyvpvghqva yrb fvg nzrg, zbyrfgvr rebf. Vagrtre np qbybe rfg. Qbarp qvtavffvz cryyragrfdhr qncvohf. Znhevf dhvf zbyyvf ahyyn, iry inevhf chehf. Phenovghe snpvyvfvf chyivane zv iry ryrvsraq. Qbarp iry hean cbfhrer, eubaphf gbegbe iry, inevhf sryvf. Irfgvohyhz iry avfv aba avou beaner ryrvsraq ivgnr pbzzbqb avou. Nyvdhnz eubaphf yhpghf iryvg aba fbqnyrf. Cebva n gbegbe rg qbybe qvtavffvz irfgvohyhz. Cebva avou avou, frzcre np fbyyvpvghqva frq, qvpghz ivgnr ghecvf.\n\nNrarna rh ardhr gvapvqhag, cbegn qbybe fvg nzrg, snhpvohf sryvf. Ahyyn snpvyvfv. Nrarna snhpvohf zv chyivane ryrvsraq rtrfgnf. Ahap znyrfhnqn ravz vq qvnz beaner znyrfhnqn. Va n frz aba ynphf srezraghz vagreqhz. Cenrfrag eubaphf gvapvqhag srhtvng. Fhfcraqvffr rhvfzbq rebf aba cynpreng pbaqvzraghz. Qbarp n cryyragrfdhr dhnz, ng cunergen fncvra. Ahyyn ivgnr frz rh qvnz uraqerevg hygevpvrf vq rh bqvb.\n\nIrfgvohyhz cunergen ybobegvf qvnz, frq cergvhz evfhf pbzzbqb np. Zbeov vq nagr znggvf, hyynzpbecre gbegbe dhvf, vagreqhz yvoreb. Fhfcraqvffr tenivqn eubaphf ahyyn, hyynzpbecre tenivqn avfy. Cunfryyhf iruvphyn qhv frq bepv pbafrpgrghe pbathr. Anz qvpghz ynpvavn yberz, rh ehgehz reng ehgehz rtrg. Qbarp vzcreqvrg ynpvavn neph, rg fhfpvcvg bepv pbafrpgrghe ng. Qbarp yhpghf ryvg yrb, ynberrg npphzfna ahap uraqerevg np. Frq whfgb rfg, ryrzraghz fvg nzrg gryyhf ivgnr, eubaphf pbzzbqb ahyyn. Cunfryyhf znhevf ghecvf, vzcreqvrg dhvf zrghf rtrg, grzcbe oynaqvg ahyyn. Irfgvohyhz iry inevhf yrb. Rgvnz hygevprf dhvf ghecvf ng pbzzbqb. Cenrfrag ivireen eubaphf neph, aba ibyhgcng znhevf yhpghf np. Anz inevhf ahap vq nagr pbaqvzraghz qvpghz frq aba ynphf. Cunfryyhf va irfgvohyhz ryvg. Vagrtre fbyyvpvghqva whfgb pbafrpgrghe, zbyyvf frz ivgnr, tenivqn znffn.\n\nCebva pbathr, gbegbe vq znyrfhnqn nyvdhnz, avfv avfv nhpgbe fncvra, iry oynaqvg avfy hean aba ynphf. Dhvfdhr eubaphf ibyhgcng yrb, fvg nzrg grzcbe zrghf vnphyvf n. Frq rg avfy iruvphyn, fbyyvpvghqva ghecvf np, uraqerevg nhthr. Frq fhfpvcvg tenivqn yhpghf. Phenovghe vq fbqnyrf gbegbe. Penf ng oynaqvg znhevf. Hg cbegn inevhf iryvg, qncvohf ybobegvf ghecvf beaner n. Cryyragrfdhr unovgnag zbeov gevfgvdhr frarpghf rg arghf rg znyrfhnqn snzrf np ghecvf rtrfgnf. Zbeov pbathr vcfhz np inevhf ynberrg. Ahap arp gvapvqhag ynphf, hg yhpghf yvthyn. Phenovghe hygevpvrf gvapvqhag zbyrfgvr. Qbarp hygevpvrf nyvdhrg srezraghz. Shfpr frq fhfpvcvg znhevf, sevatvyyn qncvohf rebf.",
				StringUtils.rot13(
						"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque urna nisl, faucibus porta purus eget, sollicitudin lacinia urna. Etiam suscipit justo fringilla, eleifend dui sed, eleifend odio. Duis non magna nisl. Nullam non enim vitae magna aliquet scelerisque vitae id tortor. Maecenas dapibus velit vitae scelerisque convallis. Mauris dolor sem, tempor vel commodo a, lacinia nec lacus. Nullam sed diam arcu. Aenean neque urna, eleifend non nisi ut, tempor sodales tortor. Fusce pharetra, orci ac tincidunt mattis, nunc quam scelerisque augue, sollicitudin feugiat magna tellus a neque. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus gravida ornare arcu quis condimentum. Fusce sit amet condimentum metus.\n\nAenean sagittis nulla sit amet nunc facilisis, dapibus cursus erat consectetur. Aenean risus magna, consequat sed turpis in, commodo consectetur elit. Duis eleifend odio interdum odio aliquet tristique. Fusce vel odio condimentum, sollicitudin leo sit amet, molestie eros. Integer ac dolor est. Donec dignissim pellentesque dapibus. Mauris quis mollis nulla, vel varius purus. Curabitur facilisis pulvinar mi vel eleifend. Donec vel urna posuere, rhoncus tortor vel, varius felis. Vestibulum vel nisi non nibh ornare eleifend vitae commodo nibh. Aliquam rhoncus luctus velit non sodales. Proin a tortor et dolor dignissim vestibulum. Proin nibh nibh, semper ac sollicitudin sed, dictum vitae turpis.\n\nAenean eu neque tincidunt, porta dolor sit amet, faucibus felis. Nulla facilisi. Aenean faucibus mi pulvinar eleifend egestas. Nunc malesuada enim id diam ornare malesuada. In a sem non lacus fermentum interdum. Praesent rhoncus tincidunt feugiat. Suspendisse euismod eros non placerat condimentum. Donec a pellentesque quam, at pharetra sapien. Nulla vitae sem eu diam hendrerit ultricies id eu odio.\n\nVestibulum pharetra lobortis diam, sed pretium risus commodo ac. Morbi id ante mattis, ullamcorper tortor quis, interdum libero. Suspendisse gravida rhoncus nulla, ullamcorper gravida nisl. Phasellus vehicula dui sed orci consectetur congue. Nam dictum lacinia lorem, eu rutrum erat rutrum eget. Donec imperdiet lacinia arcu, et suscipit orci consectetur at. Donec luctus elit leo, laoreet accumsan nunc hendrerit ac. Sed justo est, elementum sit amet tellus vitae, rhoncus commodo nulla. Phasellus mauris turpis, imperdiet quis metus eget, tempor blandit nulla. Vestibulum vel varius leo. Etiam ultrices quis turpis at commodo. Praesent viverra rhoncus arcu, non volutpat mauris luctus ac. Nam varius nunc id ante condimentum dictum sed non lacus. Phasellus in vestibulum elit. Integer sollicitudin justo consectetur, mollis sem vitae, gravida massa.\n\nProin congue, tortor id malesuada aliquam, nisi nisi auctor sapien, vel blandit nisl urna non lacus. Quisque rhoncus volutpat leo, sit amet tempor metus iaculis a. Sed et nisl vehicula, sollicitudin turpis ac, hendrerit augue. Sed suscipit gravida luctus. Curabitur id sodales tortor. Cras at blandit mauris. Ut porta varius velit, dapibus lobortis turpis ornare a. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Morbi congue ipsum ac varius laoreet. Nunc nec tincidunt lacus, ut luctus ligula. Curabitur ultricies tincidunt molestie. Donec ultricies aliquet fermentum. Fusce sed suscipit mauris, fringilla dapibus eros."));

	}

	@Test
	public void md5HashTest () {
		assertEquals("098f6bcd4621d373cade4e832627b4f6",
				StringUtils.md5Hash("test"));
	}

	@Test
	public void restrictTest () {
		assertEquals(
				"the-quick-123-jumps-over-the-lazy-456-with-many-consequnces-",
				StringUtils.restrict(
						"The quick 123 jumps over the lazy 456 with many,;_ consequnces."));
		assertEquals("the-quick-jumps-over-the-lazy-with-many-consequnces-",
				StringUtils.restrict(
						"The quick 123 jumps over the lazy 456 with many,;_ consequnces.",
						"abcdefghijklmnopqrstuvwxyz", "-", 10000));

		assertEquals("the-quick-",
				StringUtils.restrict(
						"The quick 123 jumps over the lazy 456 with many,;_ consequnces.",
						"abcdefghijklmnopqrstuvwxyz", "-", 13));

		assertEquals("-make-toxic-brew-for-and-",
				StringUtils.restrict("123 make toxic brew for; 4 and 56",
						"abcdefghijklmnopqrstuvwxyz", "-", 10000));
	}

	@Test
	public void camelCaseTest () {
		assertEquals("my1ValueProperty",
				StringUtils.camelCase("123 my 1 value property"));

		assertEquals("myproperty123", StringUtils.camelCase("myproperty123"));

		assertEquals("myProperty123", StringUtils.camelCase("myProperty123"));

		assertEquals("my123Property456Property",
				StringUtils.camelCase("my123 Property 456 property"));
	}

	@Test
	public void pascalCaseTest () {
		assertEquals("My1ValueProperty",
				StringUtils.pascalCase("123 my 1 value property"));

		assertEquals("Myproperty123", StringUtils.pascalCase("myproperty123"));

		assertEquals("MyProperty123", StringUtils.pascalCase("myProperty123"));

		assertEquals("My123Property456Property",
				StringUtils.pascalCase("my123 Property 456 property"));
	}

	@Test
	public void expandByCaseTest () {
		assertEquals("My 1 value property.", StringUtils
				.expandByCase("My1ValueProperty", true, false, " ", "."));

		assertEquals("My 1 value property.", StringUtils
				.expandByCase("my1ValueProperty", true, false, " ", "."));

		assertEquals("myproperty 123", StringUtils.expandByCase("Myproperty123",
				false, true, " ", ""));

		assertEquals("my Property 123", StringUtils
				.expandByCase("MyProperty123", false, true, " ", ""));

		assertEquals("my_123_Property_456_Property", StringUtils.expandByCase(
				"My123Property456Property", false, true, "_", ""));

		assertEquals("!_7_My_123_Property_456_Property",
				StringUtils.expandByCase("!7My123Property456property", false,
						true, "_", ""));

		// leave garbage alone
		assertEquals("!__--<>>><_7_My_123_Property!__--<>>><_456_Property",
				StringUtils.expandByCase(
						"!__--<>>><7My123Property!__--<>>><456property", false,
						true, "_", ""));
	}

	@Test
	public void constantNameTest () {
		assertEquals("k_SOME_SENTENCE_KEY",
				StringUtils.constantName("some sentence", "k", "KEY"));
	}

}

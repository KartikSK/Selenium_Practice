package com.Paytm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W_AddItemsToCart extends BasePage{

	public W_AddItemsToCart(WebDriver driverWeb) {
		super(driverWeb);
		PageFactory.initElements(driverWeb, this);
	}

	@FindBy(linkText="Electronics")
	private WebElement electonics;
	
	@FindBy(xpath=".//*[@id='c1carouselhome']/div[1]/div[1]/home-page-main-menu/div/div[2]/div[1]/ul/div[6]/ul/li/a")
	private WebElement selectHardDisk;
	
	@FindBy(xpath="//div[text()='Adata Classic HV620 2 TB External Hard Drive (Silver)']")
	private WebElement HardDisk;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement buyButton;
	
}

Movies
movies=.header a[href ='/movie/']
selectFirstMovie:(//section/div/div[2]//img)[1]
movieTitle:.inner-container-sk>h2
releaseYear:.movie_details-div>ul>li:nth-child(1)
language:.movie_details-div>ul>li:nth-child(2)
category:.movie_details-div>ul>li:nth-child(3)
playButton:.movie_details-btn-div .btn-red
shareIconCss:.icomoon.icon-icn_share
shareTitleText:.text-uppercase.modal-title
shareCancelButton:.modal-footer .btn-default
favoriteIconCss:.icomoon>img
movieDuration:.fp-duration
volumeControl:.fp-volumebar>em:nth-child(4)
settings:.fp-settings
speed:a[data-menu-group = 'speed']>div:nth-child(1)
increaseSpeed:.fp-controls-menu>a:nth-child(5)
decreaseSpeed:.fp-controls-menu>a:nth-child(3)
normalSpped:.fp-controls-menu>a:nth-child(4)

quality:a[data-menu-group = 'bitrates']>div:nth-child(2)
lowQuality:.fp-controls-menu>a:nth-child(3)
autoQuality:.fp-controls-menu>a:nth-child(2)
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserHomepage {
    public UserHomepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //ON NAVBAR
    // User Homepage Logo icon
    @FindBy(xpath="//img[@class='logo']")
    public WebElement logoHome;

    // User Homepage Home link
    @FindBy(xpath="(//li[@class])[1]")
    public WebElement linkMenuHome;

    // User Homepage Listing link
    @FindBy(xpath="(//li[@class])[2]")
    public WebElement linkMenuListing;

    // User Homepage Projects link
    @FindBy(xpath="(//li[@class])[3]")
    public WebElement linkMenuProjects;

    // User Homepage Agents link
    @FindBy(xpath="(//li[@class])[4]")
    public WebElement linkMenuAgents;

    // User Homepage Blog link
    @FindBy(xpath="(//li[@class])[5]")
    public WebElement linkMenuBlog;

    // User Homepage Contact link
    @FindBy(xpath="(//li[@class])[6]")
    public WebElement linkMenuContact;

    // User Homepage Sign Up link
    @FindBy(xpath="(//li[@class])[7]")
    public WebElement linkMenuSingUp;

    // User Homepage Add Property link
    @FindBy(xpath="//a[@class='text-success']")
    public WebElement linkAddProperty;

    // User Homepage Sign In link
    @FindBy(xpath="(//li[@class])[8]")
    public WebElement linkSignIn;

    // User Homepage Wishlist link
    @FindBy(xpath="//*[@class='text-white']")
    public WebElement linkWishlist;

    //ON FOOTER

    //User Homepage Footer
    @FindBy(xpath= "//*[@class='py-5']")
    public WebElement completeFooter;

    //User Homepage Footer about us button
    @FindBy(xpath= "//*[text()='About us']")
    public WebElement aboutUsButtonInFooter;

    //User Homepage Footer “contact us” button
    @FindBy(xpath= "//*[text()='Contact us']")
    public WebElement contactUsButtonInFooter;

    //User Homepage Footer Terms & Conditions button
    @FindBy(xpath= "//*[text()='Terms & Conditions']")
    public WebElement TermsAndConditionsButtonInFooter;

    //User Homepage Footer All properties button
    @FindBy(xpath= "//*[text()='All properties']")
    public WebElement allPropertiesButtonInFooter;

    //User Homepage Footer Houses for sale button
    @FindBy(xpath= "//*[text()='Houses for sale']")
    public WebElement housesForSaleButtonInFooter;

    //User Homepage Footer Houses for rent button
    @FindBy(xpath= "//*[text()='Houses for rent']")
    public WebElement houseForRentButtonInFooter;

    //User Homepage Footer 1. News button
    @FindBy(xpath= "//*[text()='The Benefits Of Investing In Emerging Real Estate Markets']")
    public WebElement newsOneButtonInFooter;

    //User Homepage Footer 2. News button
    @FindBy(xpath= "//*[text()='A Guide To Negotiating The Best Deal On Your Dream Home']")
    public WebElement newsTwoButtonInFooter;

    //User Homepage Footer 3. News button
    @FindBy(xpath= "//*[text()='The Rise Of Sustainable Homes: Building For A Greener Future']")
    public WebElement newsThreeButtonInFooter;

    //User Homepage Footer 4. News button
    @FindBy(xpath= "//*[text()='How to Stage Your Home for a Quick and Profitable Sale']")
    public WebElement newsFourButtonInFooter;

    //User Homepage Footer 5. News button
    @FindBy(xpath= "//*[text()='Investing in Vacation Rental Properties: A Lucrative Opportunity']")
    public WebElement newsFiveButtonInFooter;

    //User Homepage Footer google play button
    @FindBy(xpath= "(//div[@class='other-store-app'])[1]")
    public WebElement googlePlayIconInFooter;

    //User Homepage Footer apple store button
    @FindBy(xpath= "(//div[@class='other-store-app'])[2]")
    public WebElement appleStoreIconInFooter;

    //IN HOME PAGE

    //User Home Page Search Location
    @FindBy(xpath="//input[@class='form-control']")
    public WebElement searchForALocation;

    //User Home Page Min Price
    @FindBy(xpath="//span[@id='select2-minprice-container']")
    public WebElement dropDownMinPrice;

    //User Home Page Max Price
    @FindBy(xpath="//span[@id='select2-maxprice-container']")
    public WebElement dropDownMaxPrice;

    //User Home Page Property Type
    @FindBy(xpath="//span[@id='select2-ptypes-container']")
    public WebElement dropDownPropertyType;

    //User Home Page Bed Rooms
    @FindBy(xpath="//span[@id='select2-select-bedroom-container']")
    public WebElement dropDownBedRooms;

    //User Home Page Property Location
    @FindBy(xpath="//span[@id='select2-city_id-container']")
    public WebElement dropDownPropertyLocation;

    //User Home Page Search Result Button
    @FindBy(xpath="//button[@class='btn search-btn']")
    public WebElement searchResultButton;

    //User Home Page Search Result Number
    @FindBy(xpath="//h4[@class='m-0']")
    public WebElement bodySearchResultSonucSayisi;

    //IN LISTING PAGE -A  US-005

    //Listing linkine tiklayinca ve sayfada Search yapinca cikan Result Text
    @FindBy(xpath="//h4[@class='m-0']")
    public WebElement labelListingResultText;

    //Listing sayfadaki ve Search yapinca cikan ilk ilan(Property) linki
    @FindBy(xpath="(//h4[@class='listing-name'])[1]")
    public WebElement linkFirstProperty;

    //Listing sayfaya girince ve Search yapinca cikan ilk ilana tiklaninca gelen detay texti
    @FindBy(xpath="(//h4[@class='property_block_title'])[1]")
    public WebElement labelFirstPropertyDetail;

    //Listingpage search textbox
    @FindBy(xpath="//input[@name='k']")
    public WebElement textboxListingSearchLocation;

    //Listingpage Search yapma butonu
    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement buttonListingSearchSubmit;

    //IN LISTING PAGE -B  US-006

    //User Listing Page Found Result Number
    @FindBy(xpath="//div[@class='left-column pull-left']")
    public WebElement foundResultListing;

    //User Listing Page 1.Result's View Button
    @FindBy(xpath="(//div[@class='footer-flex'])[1]")
    public WebElement listingViewButton;

    //User Listing Page 1.Result's Share Icon
    @FindBy(xpath="//a[@data-original-title='Share']")
    public WebElement iconListingShare;

    //User Listing Page 1.Result's Facebook Icon
    @FindBy(xpath="//a[@class='cl-facebook']")
    public WebElement iconlistingShareFacebook;

    //User Listing Page 1.Result's Twitter Icon
    @FindBy(xpath="//a[@class='cl-twitter']")
    public WebElement iconlistingShareTwitter;

    //User Listing Page 1.Result's Linked in Icon
    @FindBy(xpath="//a[@class='cl-linkedin']")
    public WebElement iconlistingShareLinkedin;

    //User Listing Page Wish add
    @FindBy(xpath ="//a[@class='btn btn-likes add-to-wishlist']")
    public WebElement ListingSaveButonu;

    //User Listing Page Send Message Name
    @FindBy(xpath="//input[@name='name']")
    public WebElement labelListingName;

    //User Listing Page Send Message Phone
    @FindBy(xpath="//input[@name='phone']")
    public WebElement labelListingPhone;

    //User Listing Page Send Message Email
    @FindBy(xpath="//input[@id='email']")
    public WebElement labelListingEmail;

    //User Listing Page Send Message Great House
    @FindBy(xpath="//input[@value='Great House']")
    public WebElement labelListingGreatHause;

    //User Listing Page Send Message Message
    @FindBy(xpath="//textarea[@placeholder='Message']")
    public WebElement labelListingMessage;

    //User Listing Page Send Message Button
    @FindBy(xpath="//button[@class='btn btn-black btn-md rounded full-width']")
    public WebElement listingSendMessageButton;

    //IN PROJECTS PAGE

    //Projectspage listelenen projelerin sayisi
    @FindBy(xpath = "//*[@class='left-column']")
    public WebElement numbersOfProjectsProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[1]")
    public WebElement projectOneProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[2]")
    public WebElement projectTwoProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[3]")
    public WebElement projectThreeProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[4]")
    public WebElement projectFourProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[5]")
    public WebElement projectFiveProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[6]")
    public WebElement projectSixProjectspage;

    @FindBy(xpath = "(//*[@class='list-img-slide'])[7]")
    public WebElement projectSevenProjectspage;

    //Eighth Project on the Project Page
    @FindBy(xpath = "(//*[@class='list-img-slide'])[8]")
    public WebElement projectEightProjectspage;

    //Ninth Project on the Project Page
    @FindBy(xpath = "(//*[@class='list-img-slide'])[9]")
    public WebElement projectNineProjectspage;

    //Projectpage search Textbox

    //IN AGENTS PAGE

    //Agents linkine tiklayinca cikan ilk emlakci(Agent) linki
    @FindBy(xpath="(//h5[@class='fr-can-name'])[1]")
    public WebElement linkFirstAgent;

    //Agents linkine tiklayinca cikan ilk emlakci(Agent) mulk sayisi texti
    @FindBy(xpath="(//span[@class='fr-position'])[1]")
    public WebElement labelFirstAgentNumberOfProperties;

    //Agents linkine tiklayinca cikan ilk emlakci(Agent) iletisim bilgileri texti
    @FindBy(xpath="(//div[@class='fr-grid-info'])[1]")
    public WebElement labelFirstAgentContactInfo;

    //Agents linkine tiklayinca cikan ilk emlakci(Agent) detaylarina erisim butonu(view)
    @FindBy(xpath="(//a[@class='prt-view'])[1]")
    public WebElement buttonFirstAgentDetail;

    //Agents sayfada ilk emlakci detaylarindaki satilik ilanlar linki
    @FindBy(xpath="//a[@class='nav-link active ']")
    public WebElement linkFirstAgentForSale;

    //Agents sayfada ilk emlakci detaylarindaki satilik ilanlarin ilkinin detay görüntüleme linki
    @FindBy(xpath="(//a[@class='prt-view'])[1]")
    public WebElement linkFirstAgentForSaleFirstProperty;

    //Agents sayfada ilk emlakci detaylarindaki kiralik ilanlar linki
    @FindBy(xpath="(//a[@class='nav-link '])[1]")
    public WebElement linkFirstAgentForRent;

    //Agents sayfada ilk emlakci detaylarindaki kiralik ilanlarin ilkinin detay görüntüleme linki
    @FindBy(xpath="(//a[@class='prt-view'])[2]")
    public WebElement linkFirstAgentForRentFirstProperty;

    //IN BLOG PAGE

    // User Blog Page Continue Button
    @FindBy(xpath="(//a[@class='bl-continue'])[2]")
    public WebElement BlogMenuContinueButton;

    // User Blog Page Continue-Categories House Design
    @FindBy(xpath="(//a[@class='text-dark'])[1]")
    public WebElement linkBlogMenuCategories;

    // User Blog Page Continue-Categories Latest news
    @FindBy(xpath="(//a[@class='text-dark'])[2]")
    public WebElement linkBlogMenuLatestNews;

    // User Blog Page Continue-Categories House Architecture
    @FindBy(xpath="(//a[@class='text-dark'])[3]")
    public WebElement linkBlogMenuHouseArchitecture;

    // User Blog Page Continue-Categories Building Materials
    @FindBy(xpath="(//a[@class='text-dark'])[4]")
    public WebElement linkBlogMenuBuildingMaterials;

    // User Blog Page Continue-Featured Properties Pine Street
    @FindBy(xpath="(//a[text()='2468 Pine Street'])[1]")
    public WebElement linkBlogFeaturedPropertiesPineStreet;

    // User Blog Page Continue-Featured Properties Elmwood Avenue
    @FindBy(xpath="(//a[text()='13579 Elmwood Avenue'])[1]")
    public WebElement linkBlogFeaturedPropertiesElmwoodAvenue;

    // User Blog Page Continue-Featured Properties Willow Street
    @FindBy(xpath="(//a[text()='13579 Willow Street'])[1]")
    public WebElement linkBlogFeaturedPropertiesWillowStreet;

    // User Blog Page Continue-Featured Properties Oak Avenue
    @FindBy(xpath="(//a[text()='9876 Oak Avenue'])[1]")
    public WebElement linkBlogFeaturedPropertiesOakAvenue;

    // User Blog Page Continue-Featured Properties Pine Street Austin
    @FindBy(xpath="(//a[text()='2468 Pine Street'])[2]")
    public WebElement linkBlogFeaturedPropertiesPineStreetAustin;

    //User Blog Page Continue Share This Post Facebook Button
    @FindBy(xpath="//i[@class='fab fa-facebook-f']")
    public WebElement shareThisPostFacebook;

    //User Blog Page Continue Share This Post Linked in Button
    @FindBy(xpath="//a[@class='cl-linkedin']")
    public WebElement shareThisPostLinkedin;

    //User Blog Page Continue Share This Post Twitter Button
    @FindBy(xpath="//a[@class='cl-twitter']")
    public WebElement shareThisPostTwitter;

    //IN CONTACT PAGE

    //Ziyaretci Home page sayfasi contact buttonu
    @FindBy(xpath="//*[@class='current-menu-item']")
    public WebElement contactButton;

    //Ziyaretci Home page sayfasi contact butonu icinde Reach Us adres
    @FindBy(xpath="(//div[@class='cn-info-detail'])[1]")
    public WebElement ReachUsYazi;

    //Ziyaretci Home page sayfasi contact butonu icinde Email adres
    @FindBy(xpath="(//div[@class='cn-info-detail'])[2]")
    public WebElement emailYazi;

    //Ziyaretci Home page sayfasi contact butonu icinde call Us(telefon)
    @FindBy(xpath="(//div[@class='cn-info-detail'])[3]")
    public WebElement telefonYazi;

    //Ziyaretci Home page sayfasi contact butonu icinde name textbox
    @FindBy(xpath="(//input[@class='form-control simple'])[1]")
    public WebElement nameTextBox;

    //Ziyaretci Home page sayfasi contact butonu icinde email textbox
    @FindBy(xpath="(//input[@class='form-control simple'])[2]")
    public WebElement emailTextBox;

    //Ziyaretci Home page sayfasi contact butonu icinde subject textbox
    @FindBy(xpath="(//input[@class='form-control simple'])[3]")
    public WebElement subjectTextBox;

    //Ziyaretci Home page sayfasi contact butonu icinde phone textbox
    @FindBy(xpath="(//input[@class='form-control simple'])[4]")
    public WebElement phoneTextBox;

    //Ziyaretci Home page sayfasi contact butonu icinde message textbox
    @FindBy(xpath="//*[@name='content']")
    public WebElement messageTextBox;

    //Ziyaretci Home page sayfasi contact butonu icinde send message butonu
    @FindBy(xpath="//div[@class='form-actions form-group']")
    public WebElement sendMessageButton;

    //Ziyaretci Home page sayfasi contact butonu icinde send message successfully
    @FindBy(xpath="//div[@class='contact-form-group']")
    public WebElement sendMessageSuccessfully;

    //Ziyaretci Home page sayfasi contact butonu icinde harita adresi
    @FindBy(xpath="//div[@class='place-desc-large']")
    public WebElement haritaAdresYazi;

    //IN SIGN UP PAGE

    //SIGN IN PAGE
    @FindBy(xpath="//input[@id='email']")
    public WebElement usernameTextbox;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordTextbox;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement loginButonu;

    @FindBy(xpath="//*[@id='navigation']/div[2]/ul[2]/li[2]/a/span")
    public WebElement basariliGirisKontrolElementi;

    @FindBy(xpath="//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement cookiesAllowButton;

    //IN ADD PROPERTY PAGE


}

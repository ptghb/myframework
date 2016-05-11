<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Runner, Blog Page, Full Post</title>
<meta name="keywords" content="runner, blog page, full post, free template, CSS, HTML" />
<meta name="description" content="Runner, Full Blog Post, Multiple comments, free blog theme by templatemo.com" />
<link href="${pageContext.request.contextPath}/templatemo_style.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/orman.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nivo-slider.css" type="text/css" media="screen" />	

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/ddsmoothmenu.css" />

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ddsmoothmenu.js">

/***********************************************
* Smooth Navigational Menu- (c) Dynamic Drive DHTML code library (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit Dynamic Drive at http://www.dynamicdrive.com/ for full source code
***********************************************/

</script>

<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "templatemo_menu", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})

</script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/slimbox2.css" type="text/css" media="screen" /> 
<script type="text/JavaScript" src="${pageContext.request.contextPath}/js/slimbox2.js"></script> 

</head>
<body id="subpage">

<div id="templatemo_wrapper">
	<div id="templatemo_header">
        <div id="templatemo_menu" class="ddsmoothmenu">
            <ul>
                <li><a href="${pageContext.request.contextPath}/blog/blogHome" >主页</a></li>
                <li><a href="${pageContext.request.contextPath}/blog/blog?pageNo=1&pageSize=3"  >日志</a></li>
                <li><a href="${pageContext.request.contextPath}/blog/photogroup?pageNo=1&pageSize=4" class="selected">相册</a>
                    <ul>
                        <li><a href="#">2016-01-05</a></li>
                        <li><a href="#">2016-01-04</a></li>
                        <li><a href="#">2016-01-03</a></li>
                        <li><a href="#">2016-01-02</a></li>
                        <li><a href="#">2016-01-01</a></li>
                  </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/blog/about">关于我</a>
                    <ul>
                        <li><a href="#">个人独白</a></li>
                        <li><a href="#">个人经历</a></li>
                        <li><a href="#">我的简历</a></li>
                  </ul>
                </li>
                <li><a href="${pageContext.request.contextPath}/blog/contact">联系我</a></li>
            </ul>
            <br style="clear: left" />
        </div> <!-- end of templatemo_menu -->
    </div> <!-- END of header -->
    
    <div id="templatemo_page_intro">
    	<h1>Our Blog</h1>
        <p>Vestibulum justo nunc, tristique sed tincidunt eu, adipiscing at ipsum. Maecenas suscipit urna at felis accumsan porttitor. Vivamus vel porta felis.</p>
    </div>
    
    
    <div id="templatemo_main">
    	<div id="templatemo_content" class="left">
            <div class="post-item">
            	<div class="post-meta">
                	<img src="${pageContext.request.contextPath}/images/author.png" alt="post author image" />
                    <div class="post-meta-content">
                    	<h2>Nullam Non Turpis Eros Non Euismod</h2>
                        Posted by <span><a href="#">Admin</a></span>
                		| <span><a href="#">14 January 2084</a></span>
                        in <span><a href="#">Free</a>, <a href="#">Templates</a></span>
                    </div>
                    <span class="post_comment">10</span>
                    <div class="clear"></div>
				</div>
                <img class="img_border_b img_nom" src="${pageContext.request.contextPath}/images/blog/01.jpg" alt="Post Image" />
                <p align="justify">Donec non lectus urna, sed ornare magna. Morbi fringilla lorem at nulla porttitor et semper quam molestie. Nullam justo nisl, feugiat non tempor a, luctus imperdiet magna. Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est, sit amet auctor metus neque ut nisl. Validate <a href="#" ><strong>XHTML</strong></a> &amp; <a href="#" ><strong>CSS</strong></a>.</p>
                <p align="justify">Morbi venenatis augue sit amet ante facilisis feugiat sed in lectus. Vivamus imperdiet, ante a pretium vehicula, ante enim sodales mi, eu rutrum odio turpis eget arcu. Proin a elit nisl, id aliquam felis. Nunc ultrices iaculis quam, sed commodo erat tempus mollis. Duis ultricies nulla sed dolor egestas id.</p>
                <p align="justify">Lorem ipsum dolor sit amet, <a href="#">consectetur</a> adipiscing elit. Etiam nec turpis bibendum massa dapibus dictum. Donec eu odio sapien. Donec tincidunt eleifend mauris, ac volutpat leo tincidunt a. Aenean vel vehicula augue. Vestibulum lectus sem, porttitor non molestie quis, pulvinar nec nulla. Maecenas id orci vitae lectus fermentum posuere. <a href="#">Phasellus</a> lacinia eleifend elit, eu mollis erat consectetur et. </p>
                <p align="justify">Integer semper sollicitudin quam a ornare. Nam venenatis nibh ac sem faucibus et imperdiet magna laoreet. Sed at risus dui. Ut imperdiet libero at mauris vestibulum tempor. Vestibulum at lorem ac lectus rhoncus aliquet eget ac mauris. Proin nec nunc magna, eu blandit massa. Sed elementum nisi ut quam vehicula eu egestas nisi varius.</p>
          </div>
            <h3>Comments</h3>
            <ol class="comment_list">
            <li>
                <div class="comment_box">
                    <img src="${pageContext.request.contextPath}/images/avator.jpg" alt="" class="img_fl img_border" />
                    <div class="comment_content">
                        <div class="comment_meta"><strong><a href="#">Kent Well</a></strong><br />
                        Posted on 16 January 2084 [7:17 AM]</div>
                        <p>Suspendisse commodo nibh at eleifend imperdiet. Quisque sollicitudin   tellus eget sodales dapibus. Pellentesque ut sem eu diam volutpat cursus   at ut odio. Donec sit amet urna aliquet sapien tincidunt posuere.</p>
                        <a href="#" class="more">Reply</a>
                    </div>
                    <div class="clear"></div>
                </div>
            </li>
            <li>
                <ul>
                    <li class="depth_2">
                        <div class="comment_box">
                            <img src="${pageContext.request.contextPath}/images/avator.jpg" alt="" class="img_fl img_border" />
                            <div class="comment_content">
                            <div class="comment_meta"><strong><a href="#">William</a></strong><br />
                        	Posted on 18 January 2084 [7:44 PM]</div>
                            <p>Cras in metus vulputate, consequat eros a, consectetur nulla. Aliquam erat volutpat. Integer dui sapien, vehicula ut tempor nec, dignissim id lacus. Nulla porta quis purus eget dignissim.</p>
                            <a href="#" class="more">Reply</a>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </li>
                    <ul>
                        <li class="depth_3">
                            <div class="comment_box">
                                <img src="${pageContext.request.contextPath}/images/avator.jpg" alt="" class="img_fl img_border" />
                                <div class="comment_content">
                                <div class="comment_meta"><strong><a href="#">Stephen</a></strong><br />
                        		Posted on 20 January 2084 [11:50 AM]</div>
                                <p> Suspendisse commodo nibh at eleifend imperdiet. Quisque sollicitudin tellus eget sodales dapibus. Pellentesque ut sem eu diam volutpat cursus at ut odio.</p>
                                <a href="#" class="more">Reply</a>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </li>
                    </ul>
                </ul>
            </li>
            <li>
                <div class="comment_box">
                    <img src="${pageContext.request.contextPath}/images/avator.jpg" alt="" class="img_fl img_border" />
                    <div class="comment_content">
                        <div class="comment_meta"><strong><a href="#">James</a></strong><br />
                        Posted on 21 January 2084 [9:25 PM]</div>
                        <p>Morbi massa dui, pretium dictum dapibus vitae, imperdiet sit amet est.   In dui sem, vulputate quis augue dapibus, sodales dapibus velit. Etiam   aliquam laoreet cursus. Nunc sagittis metus varius congue ornare.</p>
                        <a href="#" class="more">Reply</a>
                    </div>
                    <div class="clear"></div>
                </div>
            </li>
            <li>
                <div class="comment_box">
                    <img src="${pageContext.request.contextPath}/images/avator.jpg" alt="" class="img_fl img_border" />
                    <div class="comment_content">
                        <div class="comment_meta"><strong><a href="#">Ronald Duck</a></strong><br />
                        Posted on 22 January 2084 [10:12 AM]</div>
                        <p>Nulla ut accumsan magna, in commodo erat. Maecenas sed malesuada lacus. Nam mi sem, fringilla in erat ut, aliquam rhoncus neque. Nulla laoreet ante ac eros imperdiet blandit.</p>
                        <a href="#" class="more">Reply</a>
                    </div>
                    <div class="clear"></div>
                </div>
            </li>
        </ol>
        
        <div class="clear"></div>
            
            <div class="templatemo_paging">
                <ul>
                    <li><a  href="http://www.cssmoban.com" target="_parent">Previous</a></li>
                    <li><a  href="http://www.cssmoban.com/" target="_parent">1</a></li>
                    <li><a  href="http://www.cssmoban.com/" target="_parent">2</a></li>
                    <li><a  href="http://www.cssmoban.com/" target="_parent">3</a></li>
                    <li><a  href="http://www.cssmoban.com/" target="_parent">4</a></li>
                    <li><a  href="http://www.cssmoban.com/" target="_parent">5</a></li>
                    <li><a  href="http://www.cssmoban.com/page/6" target="_parent">6</a></li>
                    <li><a  href="http://www.cssmoban.com/page/7" target="_parent">Next</a></li>
                </ul>
                <div class="clear"></div>
            </div>
            
            <div id="comment_form">
            <h3>Leave your comment</h3>
            
            <form action="#" method="post">
                <div class="form_row">
                    <label>Name</label><br />
                    <input name="fullname" type="text" maxlength="30" id="fullname" />
                </div>
                <div class="form_row">
                    <label>Email (*required)</label>
                  <br />
                    <input name="email" type="text" id="email" maxlength="30" />
                </div>
                <div class="form_row">
                    <label>Comment</label><br />
                    <textarea  name="comment" rows="" cols=""></textarea>
                </div>

                <input type="submit" name="Submit" value="Submit" class="submit_btn" />
            </form>
            
        
        </div>
            
            
        </div> <!-- END of content -->
                
		<div id="templatemo_sidebar" class="right">
			
			<div class="sidebar_section sidebar_section_bg">
                <h3>Categories</h3>
                <ul class="sidebar_link_list">
                    <li><a href="#">Consectetur adipiscing</a></li>
                    <li><a href="#">Nullam vulputate est</a></li>
                    <li><a href="#">Duis porta velit</a></li>
                    <li><a href="#">Pretium suscipit</a></li>
                    <li><a href="#">Cras pulvinar eget lacus</a></li>
                    <li><a href="#">Duis in libero est</a></li>
                    <li><a href="#">Aenean tincidunt</a></li>
                    <li><a href="#">Morbi tempus iaculis</a></li>
                </ul>
			</div>
            
            <div class="sidebar_section sidebar_section_bg">
                <h3>Recent Comments</h3>
                <ul class="sidebar_link_list comment">
                    <li>
                    	<span>Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est...</span>
                        <span class="comment_meta">
		                    <strong>Van</strong> on <a href="#">Quisque dolor dolor</a>
						</span>
					</li>
                    <li>
                    	<span>Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est...</span>
                        <span class="comment_meta">
		                    <strong>George</strong> on <a href="#">Curabitur Mollis Justo</a>
						</span>
					</li>
                    <li>
                    	<span>Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est...</span>
                        <span class="comment_meta">
		                    <strong>Walker</strong> on <a href="#">Praesent venenatis ante neque</a>
						</span>
					</li>
                    <li>
                    	<span>Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est...</span>
                        <span class="comment_meta">
		                    <strong>David</strong> on <a href="#">Etiam dictum pulvinar neque</a>
						</span>
					</li>
                    <li>
                    	<span>Donec rhoncus, neque quis dapibus dapibus, lorem tortor semper est...</span>
                        <span class="comment_meta">
		                    <strong>Zoom</strong> on <a href="#">Maecenas fringilla felis quis</a>
						</span>
					</li>
                </ul>
            </div>
            
            <div class="sidebar_section sidebar_section_bg">
                <h3>Blogroll</h3>
                <ul class="sidebar_link_list">
                    <li><a href="#">Mauris vel gravida est</a></li>
                    <li><a href="#">Duis in libero est</a></li>
                    <li><a href="#">Nulla luctus nisl nec orci</a></li>
                    <li><a href="#">Cras in metus vulputate</a></li>
                    <li><a href="#">Consectetur adipiscing eli</a></li>
                    <li><a href="#">Nullam vulputate est</a></li>
                    <li><a href="#">Duis porta velit</a></li>
                    <li><a href="#">Pretium suscipit</a></li>
                </ul>
			</div>
            
      </div>
        
        <div class="clear"></div>
                
    </div> <!-- END of main -->
</div> <!-- END of wrapper -->

<div id="templatemo_bottom_wrapper">
	<div id="templatemo_bottom">
    	
        <div class="col col_3">
            <h4>Photo Gallery</h4>
            <ul class="nobullet footer_gallery">
                <li><a href="${pageContext.request.contextPath}/images/portfolio/02.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_02.png" alt="image 2" /></a></li>
                <li><a href="${pageContext.request.contextPath}/images/portfolio/03.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_03.png" alt="image 3" /></a></li>
                <li><a href="${pageContext.request.contextPath}/images/portfolio/04.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_04.png" alt="image 4" /></a></li>
                <li><a href="${pageContext.request.contextPath}/images/portfolio/05.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_05.png" alt="image 5" /></a></li>
                <li><a href="${pageContext.request.contextPath}/images/portfolio/03.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_06.png" alt="image 6" /></a></li>
                <li><a href="${pageContext.request.contextPath}/images/portfolio/01.jpg" rel="lightbox[gallery]"><img src="${pageContext.request.contextPath}/images/templatemo_image_07.png" alt="image 7" /></a></li>
            </ul>
            <div class="clear"></div>
            <a href="portfolio.html" class="more">View all</a>
        </div>
    	
        <div class="col col_3">
        	<h4>Twitter</h4>
      		<ul class="nobullet twitter">
                <li><a href="#">@网站模板</a> Proin turpis nisi, placerat quis orci ac, tempor iaculis eros.</li>
                <li>Suspendisse enean <a href="#">#FREE</a> website template, mi lacus gravida nisi, vitae commodo orci nisi non nulla.</li>
                <li>Sed non varius lorem, in sollicitudin lectus. Cras vel urna a urna gravida consequat. Curabitur non risus dui. <a  href="#">#</a></li>
                <li><a href="#" title="" class="rower"  target="_blank"></a></li>
            </ul>
        </div>
        
        <div class="col col_3 no_mr">
        	<h4>Follow Us</h4>
            <ul class="nobullet social">
            	<li><a  href="#/templatemo" class="facebook">Facebook</a></li>
                <li><a href="#" class="twitter">Twitter</a></li>
                <li><a href="#" class="youtube">Youtube</a></li>
                <li><a href="#" class="google">Google+</a></li>
                <li><a href="#" class="vimeo">Vimeo</a></li>
                <li><a href="#" class="skype">Skype</a></li>
            </ul>
        </div>
        
        <div class="clear"></div>
    </div> <!-- END of bottom -->
    
</div> <!-- END of bottom wrapper -->

<div id="templatemo_footer_wrapper">
	<div id="templatemo_footer">
    	Copyright © 2084 Company Name ptghb
    </div> <!-- END of footer -->
</div> <!-- END of footer wrapper -->


</body>
<script type='text/javascript' src='${pageContext.request.contextPath}/js/logging.js'></script>
</html>
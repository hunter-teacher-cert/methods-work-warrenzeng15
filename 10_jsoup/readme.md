# Objective
Students will take a webpage on the internet, and then replace EVERY single image on the page with a funny photo of the student's choosing. (Example, "minionify" a webpage by replacing all the images with pictures of minions)  
Students will be able to download an html file with the changed image links.

*optional*: teacher sets up a server at school running java so that when students change images, it is actually reflected on the page.


# Instructions:
- Introduce HTML to students (we are operating under the assumption that students will have at least a little background on it before this lesson/activity). Explain/highlight to students that any image on a web page has the tag "img"
- For the warm-up task, we will have students use jsoup in order to scrape a webpage of all it's images, and then place all the urls the program gets into an arraylist.
  - If students finish this early, then have them turn this process into a method/function.
  - If they finish THAT early, then use your function to write a program that checks if any 2 websites share a picture

- Now that students know how to get all the URLs of images on a website, ask students to write a method that can replace all instances of an image URL on a webpage with another one. Have this method return the entire html of the now edited page.


*Students will start with wikipedia.java, and then using the hint of the tag for images being "img", they should be able to produce a program similar to Images.java (which they will then need to add to in order to put all the links found into an arraylist.)*

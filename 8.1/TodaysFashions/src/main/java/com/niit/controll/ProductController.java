package com.niit.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;



@Controller
public class ProductController {
	@Autowired
	ProductDAO productdao;
		
		@RequestMapping("/getProPage")
		public ModelAndView getProPage(@ModelAttribute("proobj") Product pro, Model model)
		{
			ModelAndView mv=new ModelAndView("ProductPage");
			List<Product> prolist=productdao.getProList();
			System.out.println("-------------------------------->"+prolist);
			model.addAttribute("productlist", prolist);
			return mv;
			
		}

		@RequestMapping("/addproduct")
		public ModelAndView addCategory(Product category, Model model,@ModelAttribute("catobj") Product pro)
		{
			productdao.addproduct(category);
			ModelAndView mv=new ModelAndView("ProductPage");
			List<Product> prolist=productdao.getProList();
			System.out.println("-------------------------------->"+prolist);
			model.addAttribute("productlist", prolist);
			return mv;
		}

		@RequestMapping("/deleteProduct")
		public ModelAndView deleteProduct(@RequestParam("proid")String id,@ModelAttribute("proobj") Product pro,Model model)
		{
			productdao.deleteProductById(id);
			ModelAndView mv=new ModelAndView("ProductPage");
			List<Product> prolist=productdao.getProList();
			System.out.println("-------------------------------->"+prolist);
			model.addAttribute("categorylist", prolist);
			return mv;
			
		}
		
		
		@RequestMapping("/editProduct")
		public String getCatById(@RequestParam("proid")String id,Model model,@ModelAttribute("catobj") Product pro)
		{
		 Product product=productdao.getProductById(id);
		 model.addAttribute(product);
		 return "EditProductPage";
		}
		
		@RequestMapping("/updateProduct")
		public ModelAndView updateProduct(Product product,@ModelAttribute("proobj")Product pro, Model model)
		{
			productdao.updateproduct(product);
			ModelAndView mv=new ModelAndView("login");
			/*List<Product> prolist=categorydao.getCatList();
			System.out.println("-------------------------------->"+prolist);
			model.addAttribute("productlist",prolist);*/
			return mv;
			
		}
	}
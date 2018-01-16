package com.niit.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.SupplierDAO;

import com.niit.model.Supplier;


@Controller
public class SupplierController {
	@Autowired
	SupplierDAO supplierdao;
	@RequestMapping("/getSupPage")
	public ModelAndView getSupPage(@ModelAttribute("supobj") Supplier cat, Model model)
	{
		ModelAndView mv=new ModelAndView("SupplierPage");
		List<Supplier> suplist=supplierdao.getSupList();
		System.out.println("-------------------------------->"+suplist);
		model.addAttribute("supplierlist", suplist);
		return mv;
		
	}
}

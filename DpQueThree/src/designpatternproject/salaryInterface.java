/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternproject;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Milkias
 */
public interface salaryInterface {
    void computeSalary(DefaultMutableTreeNode node);
    void printError();
}

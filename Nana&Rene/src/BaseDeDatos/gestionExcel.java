/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

        
/**
 *
 * @author Javiera Méndez
 */
public class gestionExcel
{
    Workbook wb;
    
    public String importar(File archivo, JTable tablaD){
        String respuesta = "No se pudo realizar la importación";
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = -1;
            while(filaIterator.hasNext()){
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
                Object[] listaColumna = new Object[5];
                int indiceColumna = -1;
                while(columnaIterator.hasNext()){
                    indiceColumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if(indiceFila == 0){
                        modeloT.addColumn(celda.getStringCellValue());
                    }
                    else{
                        if(celda != null){
                            switch(celda.getCellType()){
                                case Cell.CELL_TYPE_NUMERIC:
                                    listaColumna[indiceColumna] = (int) Math.round(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    listaColumna[indiceColumna] = celda.getStringCellValue();
                                case Cell.CELL_TYPE_BOOLEAN:
                                    listaColumna[indiceColumna] = celda.getBooleanCellValue();
                                    break;
                                default:
                                    listaColumna[indiceColumna] = celda.getDateCellValue();
                            }
                        }
                    }
                    if(indiceFila != 0){
                        modeloT.addRow(listaColumna);
                    }
                }
            }
            respuesta = "Importación exitosa";
        } catch (Exception e){
        }
        return respuesta;
    }
    
    public String exportar(File archivo, JTable tablaD){
        String respuesta = "No se realizo con éxito la exportación";
        int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        
        try{
            for(int i = -1; i < numFila; i++){
                Row fila = hoja.createRow(i+1);
                for(int j = 0; j < numColumna; j++){
                    Cell celda = fila.createCell(i);
                    if(i == -1){
                        celda.setCellValue(String.valueOf((tablaD.getColumnName(j))));
                    }
                    else{
                        celda.setCellValue(String.valueOf(tablaD.getValueAt(i, j)));
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            
        }
        return respuesta;
    }
}
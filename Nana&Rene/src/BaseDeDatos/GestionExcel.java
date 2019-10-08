/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import logica.*;
        
/**
 *
 * @author Javiera Méndez
 */
public class GestionExcel{
    Workbook wb;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    private ArrayList<MateriaPrima> materiasPrimas;
    
    public GestionExcel()
    {
        this.productos = new ArrayList<Producto>();
        this.pedidos = new ArrayList<Pedido>();
        this.materiasPrimas = new ArrayList<MateriaPrima>();
    }
    
    public ArrayList<Producto> importarProductos(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
   
                String nombre = "";
                int tiempoElaboracion = 0, precioVenta = 0;
                HashMap<MateriaPrima,Integer> materiasPrimas = new HashMap<>(); 
                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    switch (indiceColumna) {
                        case 0:
                            nombre = celda.getStringCellValue();
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    tiempoElaboracion = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 2:
                            String listado = celda.getStringCellValue();
                            String[] mp = listado.split(",");
                            for(int i = 0; i < mp.length; i++)
                            {
                                MateriaPrima objMP = null;
                                for(MateriaPrima materia: this.materiasPrimas){
                                    if(materia.getNombre().equals(mp[i])){
                                        objMP = materia;
                                    }
                                }
                                materiasPrimas.put(objMP, 0);
                            }   break;
                        case 3:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    precioVenta = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                Producto p = new Producto(nombre, precioVenta, tiempoElaboracion, materiasPrimas);
                productos.add(p);
                indiceFila++;
            }
        } catch (Exception e){
        }
        return productos;
    }
    
    public ArrayList<Pedido> importarPedidos(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();

                HashMap<Producto, Integer> productos = new HashMap<>();
                int cantidad = 0;
                Date fechaSolicitud = null;
                Date fechaRetiro = null;
                String nombreCliente = "", correoCliente = "", numeroCliente = "";
                int precioTotal = 0, precioAbonado = 0, descuento = 0;

                LocalTime tiempodate;
                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    //System.out.println(celda);
                    switch (indiceColumna) {
                        case 0:
                            String p = celda.getStringCellValue();
                            String[] p2 = p.split(",");
                            for(int j = 0; j < p2.length; j++)
                            {
                                String[] productoCantidad = p2[j].split("-");
                                //System.out.println(Arrays.toString(productoCantidad));
                                Producto  prod = null;
                                for(Producto aux: this.productos){
                                    if(aux.getNombre().equals(productoCantidad[1])){
                                        prod = aux;
                                        break;
                                    }
                                }
                                
                                productos.put(prod, Integer.parseInt(productoCantidad[0]));
                            }
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(celda))
                                    {
                                        fechaSolicitud = celda.getDateCellValue();
                                    }
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    String f = celda.getStringCellValue();
                                    String[] f2 = f.split("-");
                                    //System.out.println(Arrays.toString(f2));
                                    fechaSolicitud = new Date(Integer.parseInt(f2[2])-1900, Integer.parseInt(f2[1])-1, Integer.parseInt(f2[0]));
                                    //System.out.println("FS: "+fechaSolicitud);
                                    break;
                            }       break;
                        case 2:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(celda))
                                    {
                                        fechaRetiro = celda.getDateCellValue();
                                    }                                  
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    String f = celda.getStringCellValue();
                                    String[] f2 = f.split("-");
                                    //System.out.println(Arrays.toString(f2));
                                    fechaRetiro = new Date(Integer.parseInt(f2[2])-1900, Integer.parseInt(f2[1])-1, Integer.parseInt(f2[0]));
                                    //System.out.println("FR: "+fechaRetiro);
                                    break;
                            }   break;
                        case 3:
                            nombreCliente = celda.getStringCellValue();
                            break;
                        case 4:
                            correoCliente = celda.getStringCellValue();
                            break;
                        case 5:
                            numeroCliente = celda.getStringCellValue();
                            break;
                        case 7:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    precioTotal = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 8:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    descuento = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        case 9:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    descuento = (int) Math.round(celda.getNumericCellValue());
                                    break;
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                Pedido p = new Pedido(productos, fechaSolicitud, fechaRetiro, precioTotal, descuento, nombreCliente, correoCliente, numeroCliente, precioAbonado);
                pedidos.add(p);
                indiceFila++;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return pedidos;
    }
    
    public ArrayList<MateriaPrima> importarMateriasPrimas(File archivo)
    {
        try{
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = 0;
            while(filaIterator.hasNext())
            {
                if(indiceFila == 0 )
                {
                    filaIterator.next();
                }
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
   
                String nombre = "";
                double cantidad = 0.0;
                String unidad = "";
                int indiceColumna = 0;
                while(columnaIterator.hasNext())
                {
                    Cell celda = (Cell) columnaIterator.next();
                    switch (indiceColumna) {
                        case 0:
                            nombre = celda.getStringCellValue();
                            break;
                        case 1:
                            switch(celda.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    cantidad = celda.getNumericCellValue();
                                    break;
                            }   break;
                        case 2:
                            String listado = celda.getStringCellValue();
                            String[] mp = listado.split(",");
                            for(int i = 0; i < mp.length; i++)
                            {
                                unidad = celda.getStringCellValue();
                            }   break;
                        default:
                            break;
                    }
                    indiceColumna++;
                }
                MateriaPrima mp = new MateriaPrima(nombre, cantidad);
                materiasPrimas.add(mp);
                indiceFila++;
            }
        } catch (Exception e){
        }
        return materiasPrimas;
    }
    
    public String exportarProductos(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < productos.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell nombre = fila.createCell(0);
                Cell tiempo = fila.createCell(1);
                Cell materias = fila.createCell(2);
                Cell precio = fila.createCell(3);
                if(i == -1)
                {
                    nombre.setCellValue("Nombre");
                    tiempo.setCellValue("Tiempo requerido");
                    materias.setCellValue("Materias primas");
                    precio.setCellValue("Precio de venta");
                }
                else
                {
                    nombre.setCellValue(productos.get(i).getNombre());
                    tiempo.setCellValue(productos.get(i).getTiempoElaboracion());
                    HashMap<MateriaPrima, Integer> mp = productos.get(i).getMateriasPrimas();
                    String listado = "";
                    for(MateriaPrima m: mp.keySet())
                    {
                        listado += m.getNombre()+",";
                    }
                    materias.setCellValue(listado);
                    precio.setCellValue(productos.get(i).getPrecioVenta());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
    
    public String exportarPedido(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < pedidos.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell tipo = fila.createCell(0);
                Cell fechaSolicitud = fila.createCell(1);
                Cell fechaRetiro = fila.createCell(2);
                Cell nombre = fila.createCell(3);
                Cell correo = fila.createCell(4);
                Cell numero = fila.createCell(5);
                Cell estado = fila.createCell(6);
                Cell precioTotal = fila.createCell(7);
                Cell precioCancelado = fila.createCell(8);
                Cell descuento = fila.createCell(9);
                if(i == -1)
                {
                    tipo.setCellValue("Tipo de producto");
                    fechaSolicitud.setCellValue("Fecha de solicitud");
                    fechaRetiro.setCellValue("Fecha de retiro estimado");
                    nombre.setCellValue("Nombre");
                    correo.setCellValue("Correo electrónico");
                    numero.setCellValue("Número telefónico");
                    estado.setCellValue("Estado");
                    precioTotal.setCellValue("Precio total");
                    precioCancelado.setCellValue("Precio cancelado");
                    descuento.setCellValue("Porcentaje descuento");
                }
                else
                {
                    HashMap<Producto, Integer> prod = pedidos.get(i).getProductos();
                    String listado = "";
                    
                    for (Map.Entry<Producto, Integer> entry : prod.entrySet())
                    {
                        int cantidad = entry.getValue();
                        Producto producto = entry.getKey();
                        listado += cantidad+"-"+producto.getNombre()+",";
                    }
                    tipo.setCellValue(listado);

                    //DATE
                    //System.out.println(pedidos.get(i).getFechaSolicitud());
                    //System.out.println(pedidos.get(i).getFechaRetiro());
                    String pattern = "dd-MM-yyyy";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                    String fSolicitud = simpleDateFormat.format(pedidos.get(i).getFechaSolicitud());
                    String fRetiro = simpleDateFormat.format(pedidos.get(i).getFechaRetiro());
                    
                    fechaSolicitud.setCellValue(fSolicitud);
                    fechaRetiro.setCellValue(fRetiro);
                    nombre.setCellValue(pedidos.get(i).getNombreCliente());
                    correo.setCellValue(pedidos.get(i).getCorreoCliente());
                    numero.setCellValue(pedidos.get(i).getNumeroCliente());
                    estado.setCellValue(pedidos.get(i).getEstado());
                    precioTotal.setCellValue(pedidos.get(i).getPrecioTotal());
                    precioCancelado.setCellValue(pedidos.get(i).getPrecioAbonado());
                    descuento.setCellValue(pedidos.get(i).getDescuento());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
    
    public String exportarMateriasPrimas(File archivo){
        String respuesta = "No se realizo con éxito la exportación";
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }
        else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Prueba");
        try{
            for(int i = -1; i < materiasPrimas.size(); i++)
            {
                Row fila = hoja.createRow(i+1);
                Cell nombre = fila.createCell(0);
                Cell cantidad = fila.createCell(1);

                if(i == -1)
                {
                    nombre.setCellValue("Nombre");
                    cantidad.setCellValue("Cantidad");
                }
                else
                {
                    nombre.setCellValue(materiasPrimas.get(i).getNombre());
                    cantidad.setCellValue(materiasPrimas.get(i).getCantidad());
                    // REVISAR
                    //unidad.setCellValue(materiasPrimas.get(i).getUnidad());
                }
                wb.write(new FileOutputStream(archivo));
            }
            respuesta = "Exportación existosa";
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return respuesta;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }
    
    
}

/*
System.out.println(celda);
indiceColumna++;

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
}*/

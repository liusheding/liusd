package hbase.test;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

/**
 *@author liusheding
 *@version 1.0
 *@create_date 2012-8-23
 */
public class DeleteTest {

	static Configuration conf = HBaseConfiguration.create();
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		HTable table = new HTable(conf, "table2");
		Scan s = new Scan();
		//s.addFamily(Bytes.toBytes("col1"));
		ResultScanner rs = table.getScanner(s);
		int a = Integer.MAX_VALUE;
		Get get = new Get();
		for(Result r:rs){
			
			System.out.println(r);
		}
		rs.close();

	}

}

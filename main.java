
public class main {
	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(4.08);
		main.setlebar(8.54);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
			
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Nadra";
		mahasiswa.nim = "D0217512";
		mahasiswa.alamat = "kekkes";
		mahasiswa.golonganDarah = "A";
		mahasiswa.status = "pelajar";
		mahasiswa.tinggiBadan = "154";
		mahasiswa.beratBadan = "52";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
		node node = new node();
		
		//method setter node
		node.label = "MOUSE";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "muhammad mohar";
		stack.value[1] = "aswad";
		stack.value[2]= "udin";
		stack.value[3]= "sadly";
		stack.value[4]= "cippe";
		stack.value[5]= "nadra";
		stack.value[6]= "mesing";
		stack.value[7]= "ecing";
		stack.value[8]= "kaco";
		stack.value[9]= "ecce";
		stack.value[10]= "lela";
		stack.value[11]= "awi";
		stack.value[12]= "mamu";
		stack.value[13]= "mera";
		stack.value[14]= "misba";
		stack.value[15]= "ippang";
		stack.value[16]= "lina";
		stack.value[17]= "lulu";
		stack.value[18]= "nani";
		stack.value[19]= "nia";
		stack.value[20]= "husna";
		stack.value[21]= "putri";
		stack.value[22]= "ika";
		stack.value[23]= "daya";
		stack.value[24]= "alif";
		stack.value[25]= "malia";
		stack.value[26]= "ria";
		stack.value[27]= "raman";
		stack.value[28]= "alwi";
		stack.value[29]= "usdi";
		stack.value[30]= "fadly";
		stack.value[31]= "askur";
		stack.value[32]= "akku";
		stack.value[33]= "tiara";
		stack.value[34]= "mutiara";
		stack.value[35]= "intan";
		stack.value[36]= "musli";
		stack.value[37]= "muslim";
		stack.value[38]= "aksan";
		stack.value[39]= "leni";
		stack.value[40]= "sahara";
		stack.value[41]= "dila";
		stack.value[42]= "suci";
		stack.value[43]= "cici";
		stack.value[44]= "nanna";
		stack.value[45]= "uda";
		stack.value[46]= "nila";
		stack.value[47]= "wandi";
		stack.value[48]= "yana";
		stack.value[49]= "yuli";
		stack.value[50]= "ruslan";
		stack.value[51]= "muja";
		stack.value[52]= "ahmad";
		stack.value[53]= "mohar";
		stack.value[54]= "dawi";
		stack.value[55]= "akbar";
		stack.value[56]= "aswad";
		stack.value[57]= "marwah";
		stack.value[58]= "ramlah";
		stack.value[59]= "nirma";
		stack.value[60]= "rosa";
		stack.value[61]= "pa'ma";
		stack.value[62]= "mida";
		stack.value[63]= "ilham";
		stack.value[64]= "risda";
		stack.value[65]= "komar";
		stack.value[66]= "mensi";
		stack.value[67]= "arul";
		stack.value[68]= "faer";
		stack.value[69]= "firman";
		stack.value[70]= "anto";
		stack.value[71]= "nafisah";
		stack.value[72]= "sayidah";
		stack.value[73]= "mariani";
		stack.value[74]= "mujaeni";
		stack.value[75]= "adilah";
		stack.value[76]= "aldi";
		stack.value[77]= "aminah";
		stack.value[78]= "abdullah";
		stack.value[79]= "andi";
		stack.value[80]= "erwin";
		stack.value[81]= "asmira";
		stack.value[82]= "ayu";
		stack.value[83]= "bahri";
		stack.value[84]= "busman";
		stack.value[85]= "dadang";
		stack.value[86]= "farid";
		stack.value[87]= "fahmi";
		stack.value[88]= "icca";
		stack.value[89]= "isni";
		stack.value[90]= "junita";
		stack.value[91]= "kurni";
		stack.value[92]= "ma'wa";
		stack.value[93]= "mursalim";
		stack.value[94]= "pipi";
		stack.value[95]= "reni";
		stack.value[96]= "ridwan";
		stack.value[97]= "taslim";
		stack.value[98]= "tika";
		stack.value[99]= "tina";
		stack.setvalueAt(4 ,"udin");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	}
}

package chapter1;

import java.io.File;
import java.io.FileFilter;

import org.junit.jupiter.api.Test;

class MethodReferenceTest {

	@Test
	void 단계1_디렉토리_모든파일_목록() throws Exception {
		
		File[] hiddenFiles = new File(".").listFiles();
		for(File file : hiddenFiles) {
			System.out.println(file.getAbsolutePath() + ", " + file.getName());
		}
	}
	
	@Test
	void 단계2_디렉토리_모든파일_목록중_숨겨진_파일찾기() throws Exception {
		
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// 숨겨진 파일 필터링
				return pathname.isHidden();
			}
		});
		
		for(File file : hiddenFiles) {
			System.out.println(file.getAbsolutePath() + ", " + file.getName());
		}
	}
	
	@Test
	void 단계3_디렉토리_모든파일_목록중_숨겨진_파일찾기_자바8_메서드참조() throws Exception {
		
		File[] hiddenFiles = new File(".").listFiles(File::isHidden);
		
		for(File file : hiddenFiles) {
			System.out.println(file.getAbsolutePath() + ", " + file.getName());
		}
	}
}

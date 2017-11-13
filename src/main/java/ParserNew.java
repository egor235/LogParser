import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ParserNew {
    private Map<String, Integer> hasMap = new HashMap<>();
    private Map<String, Integer> result = new LinkedHashMap<>();

    public void parseMethod(String string) throws IOException {
        try {
        LogReadLexer lexer = new LogReadLexer(new ANTLRFileStream(string));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogReadParser parser = new LogReadParser(tokens);

        while (true) {

            ParseTree tree = parser.proc();
            if (Integer.parseInt(String.valueOf(tree.getChild(12))) == 500) {
                String temp = String.valueOf(tree.getChild(0));
                if (hasMap.containsKey(String.valueOf(tree.getChild(0)))) {
                    hasMap.put(temp, hasMap.get(temp) + 1);
                      } else hasMap.put(temp, 1);
                 }
             }
        }
        catch (NumberFormatException e) {
                System.out.println("Лог закончился");
            }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
            parseSort(hasMap);
        }


    public void parseSort(Map<String, Integer> hashMap) {
       // Map<String, Integer> result = new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(2)
                .forEach(s->System.out.println("IP адрес:\t"+s.getKey() + "\tКоличество обращений:\t" +  s.getValue()));
                }
        }





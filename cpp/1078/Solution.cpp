class Solution {
public:
    vector<string> findOcurrences(string text, string first, string second) {
        string newString = text + " ";
        vector<string> ans;
        string word = "";
        for(int i = 0 ; i < text.length() ; i++)
        {
            if(text[i] == ' ')
            {
                ans.push_back(word);
                word = "";
            }
            else
            {
                word += text[i];
            }
        }
       if(word.size() != 0)
       {
           ans.push_back(word);
       }
        vector<string> result;
        for(int i = 0 ; i+2 < ans.size(); i++)
        {
            if(ans[i] == first && ans[i+1] == second)
            {
                result.push_back(ans[i+2]);
            }
        }
        return result;
    }
};

package resume_ai_backend.ServicesImpl;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import resume_ai_backend.Services.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService {

    private ChatClient chatClient;

    public ResumeServiceImpl(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @Override
    public String generateResumeResponse(String userResumeDescription) {

        String promptText= """
            Generate a professional IT job resume in JSON format based on the following description:
        
       InputDescription:
       "{(UserResumeDescription)}"
       
        'I am a Java Developer with 5 years of experience in building scalable backend applications using Spring Boot and Microservices. I have expertise in MySQL and MongoDB. I am proficient in AWS and Docker for cloud deployments. I have worked at ABC Tech as a Software Engineer and at XYZ Solutions as a Senior Software Developer. I hold a Bachelor's degree in Computer Science. I have built an Expense Management System using Spring Boot and React.js. I am an AWS Certified Solutions Architect and passionate about open-source contributions.'

        Ensure that the JSON includes the following key sections, and each section must adhere to the specified structure:

        personalInformation:

        fullName: (String)

                email: (String)

                phoneNumber: (String)

                location: (String)

                linkedIn: (String, optional)

        github: (String, optional)

        portfolio: (String, optional)

        summary:

        A brief overview of skills, experience, and career goals. (String)

                skills:

        programmingLanguages: (Array of Strings)

        frameworks: (Array of Strings)

        databases: (Array of Strings)

        cloud: (Array of Strings)

        devOpsTools: (Array of Strings)

        otherSkills: (Array of Strings, optional)

        experience:

        A list of objects, each containing:

        role: (String)

                company: (String)

                location: (String)

                duration: (String)

                responsibilities: (Array of Strings)

        education:

        A list of objects, each containing:

        degree: (String)

                university: (String)

                location: (String)

                graduationYear: (String)

                certifications:

        A list of objects, each containing:

        name: (String)

                issuingOrganization: (String)

                year: (String)

                projects:

        A list of objects, each containing:

        title: (String)

                description: (String)

                technologiesUsed: (Array of Strings)

        githubLink: (String, optional)

        achievements:

        A list of notable contributions, awards, recognitions, publications, or talks. (Array of Strings)

        languages:

        A list of spoken languages. (Array of Strings)

        interests:

        Additional interests or hobbies related to technologies or professional development. (Array of Strings)
             """;
       String response= chatClient.prompt().call().content();

        return " ";
    }
}

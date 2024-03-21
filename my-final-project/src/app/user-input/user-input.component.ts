import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { OnInit } from '@angular/core';



@Component({
  selector: 'app-user-input',
  standalone: true,
  // imports: [FormBuilder, FormGroup, HttpClient],
  templateUrl: './user-input.component.html',
  styleUrl: './user-input.component.css'
})




export class UserInputComponent implements OnInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
}
}


  

  // ngOnInit() {
  // this.uploadForm = this.formBuilder.group({
  //   profile: ['']
  // });
  // }

  // SERVER_URL = "http://localhost:4200/user-input";
  // uploadForm: FormGroup | undefined;  

  // constructor(private formBuilder: FormBuilder, private httpClient: HttpClient){

  // }
  

  // onSubmit() {
  //   const formData = new FormData();
  //   formData.append('file', this.uploadForm.get('profile').value);

  //   this.httpClient.post<any>(this.SERVER_URL, formData).subscribe(
  //     (res) => console.log(res),
  //     (err) => console.log(err)
  //   );
  // }

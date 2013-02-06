package my.api

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/apiError')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class ApiErrorCollectionResource {

    def apiErrorResourceService
    
    @POST
    Response create(ApiError dto) {
        created apiErrorResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok apiErrorResourceService.readAll()
    }
    
    @Path('/{id}')
    ApiErrorResource getResource(@PathParam('id') Long id) {
        new ApiErrorResource(apiErrorResourceService: apiErrorResourceService, id:id)
    }
        
}

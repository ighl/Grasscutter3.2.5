// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AddCustomTeamReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_AddCustomTeamReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AddCustomTeamReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AddCustomTeamReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AddCustomTeamReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016AddCustomTeamReq.proto\"\u0012\n\u0010AddCustomTeamReqB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AddCustomTeamReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AddCustomTeamReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AddCustomTeamReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_descriptor, new String[0]);
    }
    
    public static final class AddCustomTeamReq extends GeneratedMessageV3 implements AddCustomTeamReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private byte memoizedIsInitialized;
        private static final AddCustomTeamReq DEFAULT_INSTANCE;
        private static final Parser<AddCustomTeamReq> PARSER;
        
        private AddCustomTeamReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AddCustomTeamReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AddCustomTeamReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AddCustomTeamReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AddCustomTeamReq.class, Builder.class);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AddCustomTeamReq)) {
                return super.equals(obj);
            }
            final AddCustomTeamReq other = (AddCustomTeamReq)obj;
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AddCustomTeamReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data);
        }
        
        public static AddCustomTeamReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddCustomTeamReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data);
        }
        
        public static AddCustomTeamReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddCustomTeamReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data);
        }
        
        public static AddCustomTeamReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AddCustomTeamReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AddCustomTeamReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddCustomTeamReq.PARSER, input);
        }
        
        public static AddCustomTeamReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddCustomTeamReq.PARSER, input, extensionRegistry);
        }
        
        public static AddCustomTeamReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddCustomTeamReq.PARSER, input);
        }
        
        public static AddCustomTeamReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AddCustomTeamReq.PARSER, input, extensionRegistry);
        }
        
        public static AddCustomTeamReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddCustomTeamReq.PARSER, input);
        }
        
        public static AddCustomTeamReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AddCustomTeamReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AddCustomTeamReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AddCustomTeamReq prototype) {
            return AddCustomTeamReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AddCustomTeamReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AddCustomTeamReq getDefaultInstance() {
            return AddCustomTeamReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<AddCustomTeamReq> parser() {
            return AddCustomTeamReq.PARSER;
        }
        
        @Override
        public Parser<AddCustomTeamReq> getParserForType() {
            return AddCustomTeamReq.PARSER;
        }
        
        @Override
        public AddCustomTeamReq getDefaultInstanceForType() {
            return AddCustomTeamReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AddCustomTeamReq();
            PARSER = new AbstractParser<AddCustomTeamReq>() {
                @Override
                public AddCustomTeamReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AddCustomTeamReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AddCustomTeamReqOrBuilder
        {
            public static final Descriptors.Descriptor getDescriptor() {
                return AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_fieldAccessorTable.ensureFieldAccessorsInitialized(AddCustomTeamReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AddCustomTeamReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AddCustomTeamReqOuterClass.internal_static_AddCustomTeamReq_descriptor;
            }
            
            @Override
            public AddCustomTeamReq getDefaultInstanceForType() {
                return AddCustomTeamReq.getDefaultInstance();
            }
            
            @Override
            public AddCustomTeamReq build() {
                final AddCustomTeamReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AddCustomTeamReq buildPartial() {
                final AddCustomTeamReq result = new AddCustomTeamReq(this);
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof AddCustomTeamReq) {
                    return this.mergeFrom((AddCustomTeamReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AddCustomTeamReq other) {
                if (other == AddCustomTeamReq.getDefaultInstance()) {
                    return this;
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                AddCustomTeamReq parsedMessage = null;
                try {
                    parsedMessage = AddCustomTeamReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AddCustomTeamReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AddCustomTeamReqOrBuilder extends MessageOrBuilder
    {
    }
}

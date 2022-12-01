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

public final class HomeChooseModuleReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeChooseModuleReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeChooseModuleReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeChooseModuleReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeChooseModuleReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeChooseModuleReq.proto\"(\n\u0013HomeChooseModuleReq\u0012\u0011\n\tmodule_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeChooseModuleReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeChooseModuleReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeChooseModuleReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor, new String[] { "ModuleId" });
    }
    
    public static final class HomeChooseModuleReq extends GeneratedMessageV3 implements HomeChooseModuleReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MODULE_ID_FIELD_NUMBER = 9;
        private int moduleId_;
        private byte memoizedIsInitialized;
        private static final HomeChooseModuleReq DEFAULT_INSTANCE;
        private static final Parser<HomeChooseModuleReq> PARSER;
        
        private HomeChooseModuleReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeChooseModuleReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeChooseModuleReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeChooseModuleReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.moduleId_ = input.readUInt32();
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
            return HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChooseModuleReq.class, Builder.class);
        }
        
        @Override
        public int getModuleId() {
            return this.moduleId_;
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
            if (this.moduleId_ != 0) {
                output.writeUInt32(9, this.moduleId_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.moduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.moduleId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeChooseModuleReq)) {
                return super.equals(obj);
            }
            final HomeChooseModuleReq other = (HomeChooseModuleReq)obj;
            return this.getModuleId() == other.getModuleId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getModuleId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeChooseModuleReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleReq.PARSER, input);
        }
        
        public static HomeChooseModuleReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeChooseModuleReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChooseModuleReq.PARSER, input);
        }
        
        public static HomeChooseModuleReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChooseModuleReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeChooseModuleReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleReq.PARSER, input);
        }
        
        public static HomeChooseModuleReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeChooseModuleReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeChooseModuleReq prototype) {
            return HomeChooseModuleReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeChooseModuleReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeChooseModuleReq getDefaultInstance() {
            return HomeChooseModuleReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeChooseModuleReq> parser() {
            return HomeChooseModuleReq.PARSER;
        }
        
        @Override
        public Parser<HomeChooseModuleReq> getParserForType() {
            return HomeChooseModuleReq.PARSER;
        }
        
        @Override
        public HomeChooseModuleReq getDefaultInstanceForType() {
            return HomeChooseModuleReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeChooseModuleReq();
            PARSER = new AbstractParser<HomeChooseModuleReq>() {
                @Override
                public HomeChooseModuleReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeChooseModuleReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeChooseModuleReqOrBuilder
        {
            private int moduleId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChooseModuleReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeChooseModuleReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.moduleId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeChooseModuleReqOuterClass.internal_static_HomeChooseModuleReq_descriptor;
            }
            
            @Override
            public HomeChooseModuleReq getDefaultInstanceForType() {
                return HomeChooseModuleReq.getDefaultInstance();
            }
            
            @Override
            public HomeChooseModuleReq build() {
                final HomeChooseModuleReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeChooseModuleReq buildPartial() {
                final HomeChooseModuleReq result = new HomeChooseModuleReq(this);
                result.moduleId_ = this.moduleId_;
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
                if (other instanceof HomeChooseModuleReq) {
                    return this.mergeFrom((HomeChooseModuleReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeChooseModuleReq other) {
                if (other == HomeChooseModuleReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getModuleId() != 0) {
                    this.setModuleId(other.getModuleId());
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
                HomeChooseModuleReq parsedMessage = null;
                try {
                    parsedMessage = HomeChooseModuleReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeChooseModuleReq)e.getUnfinishedMessage();
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
            public int getModuleId() {
                return this.moduleId_;
            }
            
            public Builder setModuleId(final int value) {
                this.moduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearModuleId() {
                this.moduleId_ = 0;
                this.onChanged();
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
    
    public interface HomeChooseModuleReqOrBuilder extends MessageOrBuilder
    {
        int getModuleId();
    }
}

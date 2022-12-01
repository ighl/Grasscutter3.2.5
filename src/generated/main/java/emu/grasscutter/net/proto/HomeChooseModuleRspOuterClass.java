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

public final class HomeChooseModuleRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeChooseModuleRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeChooseModuleRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeChooseModuleRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeChooseModuleRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeChooseModuleRsp.proto\"9\n\u0013HomeChooseModuleRsp\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u0012\u0011\n\tmodule_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeChooseModuleRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeChooseModuleRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeChooseModuleRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_descriptor, new String[] { "Retcode", "ModuleId" });
    }
    
    public static final class HomeChooseModuleRsp extends GeneratedMessageV3 implements HomeChooseModuleRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        public static final int MODULE_ID_FIELD_NUMBER = 8;
        private int moduleId_;
        private byte memoizedIsInitialized;
        private static final HomeChooseModuleRsp DEFAULT_INSTANCE;
        private static final Parser<HomeChooseModuleRsp> PARSER;
        
        private HomeChooseModuleRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeChooseModuleRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeChooseModuleRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeChooseModuleRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 64: {
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
            return HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChooseModuleRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            if (this.moduleId_ != 0) {
                output.writeUInt32(8, this.moduleId_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            if (this.moduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.moduleId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeChooseModuleRsp)) {
                return super.equals(obj);
            }
            final HomeChooseModuleRsp other = (HomeChooseModuleRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getModuleId() == other.getModuleId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getModuleId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeChooseModuleRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data);
        }
        
        public static HomeChooseModuleRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeChooseModuleRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeChooseModuleRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleRsp.PARSER, input);
        }
        
        public static HomeChooseModuleRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeChooseModuleRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChooseModuleRsp.PARSER, input);
        }
        
        public static HomeChooseModuleRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeChooseModuleRsp.PARSER, input, extensionRegistry);
        }
        
        public static HomeChooseModuleRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleRsp.PARSER, input);
        }
        
        public static HomeChooseModuleRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeChooseModuleRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeChooseModuleRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeChooseModuleRsp prototype) {
            return HomeChooseModuleRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeChooseModuleRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeChooseModuleRsp getDefaultInstance() {
            return HomeChooseModuleRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeChooseModuleRsp> parser() {
            return HomeChooseModuleRsp.PARSER;
        }
        
        @Override
        public Parser<HomeChooseModuleRsp> getParserForType() {
            return HomeChooseModuleRsp.PARSER;
        }
        
        @Override
        public HomeChooseModuleRsp getDefaultInstanceForType() {
            return HomeChooseModuleRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeChooseModuleRsp();
            PARSER = new AbstractParser<HomeChooseModuleRsp>() {
                @Override
                public HomeChooseModuleRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeChooseModuleRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeChooseModuleRspOrBuilder
        {
            private int retcode_;
            private int moduleId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeChooseModuleRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeChooseModuleRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.moduleId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeChooseModuleRspOuterClass.internal_static_HomeChooseModuleRsp_descriptor;
            }
            
            @Override
            public HomeChooseModuleRsp getDefaultInstanceForType() {
                return HomeChooseModuleRsp.getDefaultInstance();
            }
            
            @Override
            public HomeChooseModuleRsp build() {
                final HomeChooseModuleRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeChooseModuleRsp buildPartial() {
                final HomeChooseModuleRsp result = new HomeChooseModuleRsp(this);
                result.retcode_ = this.retcode_;
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
                if (other instanceof HomeChooseModuleRsp) {
                    return this.mergeFrom((HomeChooseModuleRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeChooseModuleRsp other) {
                if (other == HomeChooseModuleRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                HomeChooseModuleRsp parsedMessage = null;
                try {
                    parsedMessage = HomeChooseModuleRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeChooseModuleRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
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
    
    public interface HomeChooseModuleRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getModuleId();
    }
}

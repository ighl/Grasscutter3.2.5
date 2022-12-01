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

public final class HomeSceneInitFinishReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeSceneInitFinishReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeSceneInitFinishReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeSceneInitFinishReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeSceneInitFinishReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cHomeSceneInitFinishReq.proto\"\u0018\n\u0016HomeSceneInitFinishReqB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeSceneInitFinishReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeSceneInitFinishReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeSceneInitFinishReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_descriptor, new String[0]);
    }
    
    public static final class HomeSceneInitFinishReq extends GeneratedMessageV3 implements HomeSceneInitFinishReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private byte memoizedIsInitialized;
        private static final HomeSceneInitFinishReq DEFAULT_INSTANCE;
        private static final Parser<HomeSceneInitFinishReq> PARSER;
        
        private HomeSceneInitFinishReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeSceneInitFinishReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeSceneInitFinishReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeSceneInitFinishReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneInitFinishReq.class, Builder.class);
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
            if (!(obj instanceof HomeSceneInitFinishReq)) {
                return super.equals(obj);
            }
            final HomeSceneInitFinishReq other = (HomeSceneInitFinishReq)obj;
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
        
        public static HomeSceneInitFinishReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneInitFinishReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneInitFinishReq.PARSER, input);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneInitFinishReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneInitFinishReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneInitFinishReq.PARSER, input);
        }
        
        public static HomeSceneInitFinishReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneInitFinishReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneInitFinishReq.PARSER, input);
        }
        
        public static HomeSceneInitFinishReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneInitFinishReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeSceneInitFinishReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeSceneInitFinishReq prototype) {
            return HomeSceneInitFinishReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeSceneInitFinishReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeSceneInitFinishReq getDefaultInstance() {
            return HomeSceneInitFinishReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeSceneInitFinishReq> parser() {
            return HomeSceneInitFinishReq.PARSER;
        }
        
        @Override
        public Parser<HomeSceneInitFinishReq> getParserForType() {
            return HomeSceneInitFinishReq.PARSER;
        }
        
        @Override
        public HomeSceneInitFinishReq getDefaultInstanceForType() {
            return HomeSceneInitFinishReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeSceneInitFinishReq();
            PARSER = new AbstractParser<HomeSceneInitFinishReq>() {
                @Override
                public HomeSceneInitFinishReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeSceneInitFinishReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeSceneInitFinishReqOrBuilder
        {
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneInitFinishReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeSceneInitFinishReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeSceneInitFinishReqOuterClass.internal_static_HomeSceneInitFinishReq_descriptor;
            }
            
            @Override
            public HomeSceneInitFinishReq getDefaultInstanceForType() {
                return HomeSceneInitFinishReq.getDefaultInstance();
            }
            
            @Override
            public HomeSceneInitFinishReq build() {
                final HomeSceneInitFinishReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeSceneInitFinishReq buildPartial() {
                final HomeSceneInitFinishReq result = new HomeSceneInitFinishReq(this);
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
                if (other instanceof HomeSceneInitFinishReq) {
                    return this.mergeFrom((HomeSceneInitFinishReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeSceneInitFinishReq other) {
                if (other == HomeSceneInitFinishReq.getDefaultInstance()) {
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
                HomeSceneInitFinishReq parsedMessage = null;
                try {
                    parsedMessage = HomeSceneInitFinishReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeSceneInitFinishReq)e.getUnfinishedMessage();
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
    
    public interface HomeSceneInitFinishReqOrBuilder extends MessageOrBuilder
    {
    }
}

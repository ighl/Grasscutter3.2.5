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
import com.google.protobuf.Internal;
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

public final class HomeSceneJumpReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeSceneJumpReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeSceneJumpReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeSceneJumpReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeSceneJumpReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016HomeSceneJumpReq.proto\"/\n\u0010HomeSceneJumpReq\u0012\u001b\n\u0013is_enter_room_scene\u0018\t \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeSceneJumpReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeSceneJumpReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeSceneJumpReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_descriptor, new String[] { "IsEnterRoomScene" });
    }
    
    public static final class HomeSceneJumpReq extends GeneratedMessageV3 implements HomeSceneJumpReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ENTER_ROOM_SCENE_FIELD_NUMBER = 9;
        private boolean isEnterRoomScene_;
        private byte memoizedIsInitialized;
        private static final HomeSceneJumpReq DEFAULT_INSTANCE;
        private static final Parser<HomeSceneJumpReq> PARSER;
        
        private HomeSceneJumpReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeSceneJumpReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeSceneJumpReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeSceneJumpReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isEnterRoomScene_ = input.readBool();
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
            return HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneJumpReq.class, Builder.class);
        }
        
        @Override
        public boolean getIsEnterRoomScene() {
            return this.isEnterRoomScene_;
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
            if (this.isEnterRoomScene_) {
                output.writeBool(9, this.isEnterRoomScene_);
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
            if (this.isEnterRoomScene_) {
                size += CodedOutputStream.computeBoolSize(9, this.isEnterRoomScene_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeSceneJumpReq)) {
                return super.equals(obj);
            }
            final HomeSceneJumpReq other = (HomeSceneJumpReq)obj;
            return this.getIsEnterRoomScene() == other.getIsEnterRoomScene() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEnterRoomScene());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeSceneJumpReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneJumpReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneJumpReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneJumpReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneJumpReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data);
        }
        
        public static HomeSceneJumpReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeSceneJumpReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeSceneJumpReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneJumpReq.PARSER, input);
        }
        
        public static HomeSceneJumpReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneJumpReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneJumpReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneJumpReq.PARSER, input);
        }
        
        public static HomeSceneJumpReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeSceneJumpReq.PARSER, input, extensionRegistry);
        }
        
        public static HomeSceneJumpReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneJumpReq.PARSER, input);
        }
        
        public static HomeSceneJumpReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeSceneJumpReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeSceneJumpReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeSceneJumpReq prototype) {
            return HomeSceneJumpReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeSceneJumpReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeSceneJumpReq getDefaultInstance() {
            return HomeSceneJumpReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeSceneJumpReq> parser() {
            return HomeSceneJumpReq.PARSER;
        }
        
        @Override
        public Parser<HomeSceneJumpReq> getParserForType() {
            return HomeSceneJumpReq.PARSER;
        }
        
        @Override
        public HomeSceneJumpReq getDefaultInstanceForType() {
            return HomeSceneJumpReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeSceneJumpReq();
            PARSER = new AbstractParser<HomeSceneJumpReq>() {
                @Override
                public HomeSceneJumpReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeSceneJumpReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeSceneJumpReqOrBuilder
        {
            private boolean isEnterRoomScene_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeSceneJumpReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeSceneJumpReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isEnterRoomScene_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeSceneJumpReqOuterClass.internal_static_HomeSceneJumpReq_descriptor;
            }
            
            @Override
            public HomeSceneJumpReq getDefaultInstanceForType() {
                return HomeSceneJumpReq.getDefaultInstance();
            }
            
            @Override
            public HomeSceneJumpReq build() {
                final HomeSceneJumpReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeSceneJumpReq buildPartial() {
                final HomeSceneJumpReq result = new HomeSceneJumpReq(this);
                result.isEnterRoomScene_ = this.isEnterRoomScene_;
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
                if (other instanceof HomeSceneJumpReq) {
                    return this.mergeFrom((HomeSceneJumpReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeSceneJumpReq other) {
                if (other == HomeSceneJumpReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsEnterRoomScene()) {
                    this.setIsEnterRoomScene(other.getIsEnterRoomScene());
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
                HomeSceneJumpReq parsedMessage = null;
                try {
                    parsedMessage = HomeSceneJumpReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeSceneJumpReq)e.getUnfinishedMessage();
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
            public boolean getIsEnterRoomScene() {
                return this.isEnterRoomScene_;
            }
            
            public Builder setIsEnterRoomScene(final boolean value) {
                this.isEnterRoomScene_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsEnterRoomScene() {
                this.isEnterRoomScene_ = false;
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
    
    public interface HomeSceneJumpReqOrBuilder extends MessageOrBuilder
    {
        boolean getIsEnterRoomScene();
    }
}

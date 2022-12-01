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

public final class PlayerCookArgsReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerCookArgsReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerCookArgsReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerCookArgsReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerCookArgsReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017PlayerCookArgsReq.proto\"=\n\u0011PlayerCookArgsReq\u0012\u0015\n\rassist_avatar\u0018\n \u0001(\r\u0012\u0011\n\trecipe_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerCookArgsReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerCookArgsReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerCookArgsReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor, new String[] { "AssistAvatar", "RecipeId" });
    }
    
    public static final class PlayerCookArgsReq extends GeneratedMessageV3 implements PlayerCookArgsReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ASSIST_AVATAR_FIELD_NUMBER = 10;
        private int assistAvatar_;
        public static final int RECIPE_ID_FIELD_NUMBER = 11;
        private int recipeId_;
        private byte memoizedIsInitialized;
        private static final PlayerCookArgsReq DEFAULT_INSTANCE;
        private static final Parser<PlayerCookArgsReq> PARSER;
        
        private PlayerCookArgsReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerCookArgsReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerCookArgsReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerCookArgsReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 80: {
                            this.assistAvatar_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.recipeId_ = input.readUInt32();
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
            return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookArgsReq.class, Builder.class);
        }
        
        @Override
        public int getAssistAvatar() {
            return this.assistAvatar_;
        }
        
        @Override
        public int getRecipeId() {
            return this.recipeId_;
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
            if (this.assistAvatar_ != 0) {
                output.writeUInt32(10, this.assistAvatar_);
            }
            if (this.recipeId_ != 0) {
                output.writeUInt32(11, this.recipeId_);
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
            if (this.assistAvatar_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.assistAvatar_);
            }
            if (this.recipeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.recipeId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerCookArgsReq)) {
                return super.equals(obj);
            }
            final PlayerCookArgsReq other = (PlayerCookArgsReq)obj;
            return this.getAssistAvatar() == other.getAssistAvatar() && this.getRecipeId() == other.getRecipeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getAssistAvatar();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRecipeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerCookArgsReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsReq.PARSER, input);
        }
        
        public static PlayerCookArgsReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookArgsReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookArgsReq.PARSER, input);
        }
        
        public static PlayerCookArgsReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookArgsReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookArgsReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsReq.PARSER, input);
        }
        
        public static PlayerCookArgsReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerCookArgsReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerCookArgsReq prototype) {
            return PlayerCookArgsReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerCookArgsReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerCookArgsReq getDefaultInstance() {
            return PlayerCookArgsReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerCookArgsReq> parser() {
            return PlayerCookArgsReq.PARSER;
        }
        
        @Override
        public Parser<PlayerCookArgsReq> getParserForType() {
            return PlayerCookArgsReq.PARSER;
        }
        
        @Override
        public PlayerCookArgsReq getDefaultInstanceForType() {
            return PlayerCookArgsReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerCookArgsReq();
            PARSER = new AbstractParser<PlayerCookArgsReq>() {
                @Override
                public PlayerCookArgsReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerCookArgsReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerCookArgsReqOrBuilder
        {
            private int assistAvatar_;
            private int recipeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookArgsReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerCookArgsReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.assistAvatar_ = 0;
                this.recipeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerCookArgsReqOuterClass.internal_static_PlayerCookArgsReq_descriptor;
            }
            
            @Override
            public PlayerCookArgsReq getDefaultInstanceForType() {
                return PlayerCookArgsReq.getDefaultInstance();
            }
            
            @Override
            public PlayerCookArgsReq build() {
                final PlayerCookArgsReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerCookArgsReq buildPartial() {
                final PlayerCookArgsReq result = new PlayerCookArgsReq(this);
                result.assistAvatar_ = this.assistAvatar_;
                result.recipeId_ = this.recipeId_;
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
                if (other instanceof PlayerCookArgsReq) {
                    return this.mergeFrom((PlayerCookArgsReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerCookArgsReq other) {
                if (other == PlayerCookArgsReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getAssistAvatar() != 0) {
                    this.setAssistAvatar(other.getAssistAvatar());
                }
                if (other.getRecipeId() != 0) {
                    this.setRecipeId(other.getRecipeId());
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
                PlayerCookArgsReq parsedMessage = null;
                try {
                    parsedMessage = PlayerCookArgsReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerCookArgsReq)e.getUnfinishedMessage();
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
            public int getAssistAvatar() {
                return this.assistAvatar_;
            }
            
            public Builder setAssistAvatar(final int value) {
                this.assistAvatar_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAssistAvatar() {
                this.assistAvatar_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRecipeId() {
                return this.recipeId_;
            }
            
            public Builder setRecipeId(final int value) {
                this.recipeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRecipeId() {
                this.recipeId_ = 0;
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
    
    public interface PlayerCookArgsReqOrBuilder extends MessageOrBuilder
    {
        int getAssistAvatar();
        
        int getRecipeId();
    }
}

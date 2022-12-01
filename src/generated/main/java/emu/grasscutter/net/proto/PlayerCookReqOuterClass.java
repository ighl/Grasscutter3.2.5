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

public final class PlayerCookReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerCookReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerCookReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerCookReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerCookReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013PlayerCookReq.proto\"b\n\rPlayerCookReq\u0012\u0012\n\ncook_count\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bqte_quality\u0018\f \u0001(\r\u0012\u0011\n\trecipe_id\u0018\b \u0001(\r\u0012\u0015\n\rassist_avatar\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerCookReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerCookReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerCookReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor, new String[] { "CookCount", "QteQuality", "RecipeId", "AssistAvatar" });
    }
    
    public static final class PlayerCookReq extends GeneratedMessageV3 implements PlayerCookReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int COOK_COUNT_FIELD_NUMBER = 1;
        private int cookCount_;
        public static final int QTE_QUALITY_FIELD_NUMBER = 12;
        private int qteQuality_;
        public static final int RECIPE_ID_FIELD_NUMBER = 8;
        private int recipeId_;
        public static final int ASSIST_AVATAR_FIELD_NUMBER = 14;
        private int assistAvatar_;
        private byte memoizedIsInitialized;
        private static final PlayerCookReq DEFAULT_INSTANCE;
        private static final Parser<PlayerCookReq> PARSER;
        
        private PlayerCookReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerCookReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerCookReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerCookReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.cookCount_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.recipeId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.qteQuality_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.assistAvatar_ = input.readUInt32();
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
            return PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerCookReqOuterClass.internal_static_PlayerCookReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookReq.class, Builder.class);
        }
        
        @Override
        public int getCookCount() {
            return this.cookCount_;
        }
        
        @Override
        public int getQteQuality() {
            return this.qteQuality_;
        }
        
        @Override
        public int getRecipeId() {
            return this.recipeId_;
        }
        
        @Override
        public int getAssistAvatar() {
            return this.assistAvatar_;
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
            if (this.cookCount_ != 0) {
                output.writeUInt32(1, this.cookCount_);
            }
            if (this.recipeId_ != 0) {
                output.writeUInt32(8, this.recipeId_);
            }
            if (this.qteQuality_ != 0) {
                output.writeUInt32(12, this.qteQuality_);
            }
            if (this.assistAvatar_ != 0) {
                output.writeUInt32(14, this.assistAvatar_);
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
            if (this.cookCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.cookCount_);
            }
            if (this.recipeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.recipeId_);
            }
            if (this.qteQuality_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.qteQuality_);
            }
            if (this.assistAvatar_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.assistAvatar_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerCookReq)) {
                return super.equals(obj);
            }
            final PlayerCookReq other = (PlayerCookReq)obj;
            return this.getCookCount() == other.getCookCount() && this.getQteQuality() == other.getQteQuality() && this.getRecipeId() == other.getRecipeId() && this.getAssistAvatar() == other.getAssistAvatar() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getCookCount();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getQteQuality();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRecipeId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getAssistAvatar();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerCookReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data);
        }
        
        public static PlayerCookReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookReq.PARSER, input);
        }
        
        public static PlayerCookReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookReq.PARSER, input);
        }
        
        public static PlayerCookReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookReq.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookReq.PARSER, input);
        }
        
        public static PlayerCookReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerCookReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerCookReq prototype) {
            return PlayerCookReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerCookReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerCookReq getDefaultInstance() {
            return PlayerCookReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerCookReq> parser() {
            return PlayerCookReq.PARSER;
        }
        
        @Override
        public Parser<PlayerCookReq> getParserForType() {
            return PlayerCookReq.PARSER;
        }
        
        @Override
        public PlayerCookReq getDefaultInstanceForType() {
            return PlayerCookReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerCookReq();
            PARSER = new AbstractParser<PlayerCookReq>() {
                @Override
                public PlayerCookReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerCookReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerCookReqOrBuilder
        {
            private int cookCount_;
            private int qteQuality_;
            private int recipeId_;
            private int assistAvatar_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerCookReqOuterClass.internal_static_PlayerCookReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerCookReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cookCount_ = 0;
                this.qteQuality_ = 0;
                this.recipeId_ = 0;
                this.assistAvatar_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerCookReqOuterClass.internal_static_PlayerCookReq_descriptor;
            }
            
            @Override
            public PlayerCookReq getDefaultInstanceForType() {
                return PlayerCookReq.getDefaultInstance();
            }
            
            @Override
            public PlayerCookReq build() {
                final PlayerCookReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerCookReq buildPartial() {
                final PlayerCookReq result = new PlayerCookReq(this);
                result.cookCount_ = this.cookCount_;
                result.qteQuality_ = this.qteQuality_;
                result.recipeId_ = this.recipeId_;
                result.assistAvatar_ = this.assistAvatar_;
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
                if (other instanceof PlayerCookReq) {
                    return this.mergeFrom((PlayerCookReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerCookReq other) {
                if (other == PlayerCookReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getCookCount() != 0) {
                    this.setCookCount(other.getCookCount());
                }
                if (other.getQteQuality() != 0) {
                    this.setQteQuality(other.getQteQuality());
                }
                if (other.getRecipeId() != 0) {
                    this.setRecipeId(other.getRecipeId());
                }
                if (other.getAssistAvatar() != 0) {
                    this.setAssistAvatar(other.getAssistAvatar());
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
                PlayerCookReq parsedMessage = null;
                try {
                    parsedMessage = PlayerCookReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerCookReq)e.getUnfinishedMessage();
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
            public int getCookCount() {
                return this.cookCount_;
            }
            
            public Builder setCookCount(final int value) {
                this.cookCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCookCount() {
                this.cookCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQteQuality() {
                return this.qteQuality_;
            }
            
            public Builder setQteQuality(final int value) {
                this.qteQuality_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQteQuality() {
                this.qteQuality_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PlayerCookReqOrBuilder extends MessageOrBuilder
    {
        int getCookCount();
        
        int getQteQuality();
        
        int getRecipeId();
        
        int getAssistAvatar();
    }
}

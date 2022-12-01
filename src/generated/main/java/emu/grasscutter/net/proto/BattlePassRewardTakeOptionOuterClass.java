// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class BattlePassRewardTakeOptionOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassRewardTakeOption_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassRewardTakeOption_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassRewardTakeOptionOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassRewardTakeOptionOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n BattlePassRewardTakeOption.proto\u001a\u0019BattlePassRewardTag.proto\"S\n\u001aBattlePassRewardTakeOption\u0012!\n\u0003tag\u0018\n \u0001(\u000b2\u0014.BattlePassRewardTag\u0012\u0012\n\noption_idx\u0018\u000e \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassRewardTakeOptionOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassRewardTagOuterClass.getDescriptor() });
        internal_static_BattlePassRewardTakeOption_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassRewardTakeOption_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor, new String[] { "Tag", "OptionIdx" });
        BattlePassRewardTagOuterClass.getDescriptor();
    }
    
    public static final class BattlePassRewardTakeOption extends GeneratedMessageV3 implements BattlePassRewardTakeOptionOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TAG_FIELD_NUMBER = 10;
        private BattlePassRewardTagOuterClass.BattlePassRewardTag tag_;
        public static final int OPTION_IDX_FIELD_NUMBER = 14;
        private int optionIdx_;
        private byte memoizedIsInitialized;
        private static final BattlePassRewardTakeOption DEFAULT_INSTANCE;
        private static final Parser<BattlePassRewardTakeOption> PARSER;
        
        private BattlePassRewardTakeOption(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassRewardTakeOption() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassRewardTakeOption();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassRewardTakeOption(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 82: {
                            BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder subBuilder = null;
                            if (this.tag_ != null) {
                                subBuilder = this.tag_.toBuilder();
                            }
                            this.tag_ = input.readMessage(BattlePassRewardTagOuterClass.BattlePassRewardTag.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.tag_);
                                this.tag_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            this.optionIdx_ = input.readUInt32();
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
            return BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassRewardTakeOption.class, Builder.class);
        }
        
        @Override
        public boolean hasTag() {
            return this.tag_ != null;
        }
        
        @Override
        public BattlePassRewardTagOuterClass.BattlePassRewardTag getTag() {
            return (this.tag_ == null) ? BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : this.tag_;
        }
        
        @Override
        public BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder() {
            return this.getTag();
        }
        
        @Override
        public int getOptionIdx() {
            return this.optionIdx_;
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
            if (this.tag_ != null) {
                output.writeMessage(10, this.getTag());
            }
            if (this.optionIdx_ != 0) {
                output.writeUInt32(14, this.optionIdx_);
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
            if (this.tag_ != null) {
                size += CodedOutputStream.computeMessageSize(10, this.getTag());
            }
            if (this.optionIdx_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.optionIdx_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassRewardTakeOption)) {
                return super.equals(obj);
            }
            final BattlePassRewardTakeOption other = (BattlePassRewardTakeOption)obj;
            return this.hasTag() == other.hasTag() && (!this.hasTag() || this.getTag().equals(other.getTag())) && this.getOptionIdx() == other.getOptionIdx() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTag()) {
                hash = 37 * hash + 10;
                hash = 53 * hash + this.getTag().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getOptionIdx();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassRewardTakeOption parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassRewardTakeOption.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTakeOption.PARSER, input);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTakeOption.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassRewardTakeOption parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassRewardTakeOption.PARSER, input);
        }
        
        public static BattlePassRewardTakeOption parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassRewardTakeOption.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTakeOption.PARSER, input);
        }
        
        public static BattlePassRewardTakeOption parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassRewardTakeOption.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassRewardTakeOption.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassRewardTakeOption prototype) {
            return BattlePassRewardTakeOption.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassRewardTakeOption.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassRewardTakeOption getDefaultInstance() {
            return BattlePassRewardTakeOption.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassRewardTakeOption> parser() {
            return BattlePassRewardTakeOption.PARSER;
        }
        
        @Override
        public Parser<BattlePassRewardTakeOption> getParserForType() {
            return BattlePassRewardTakeOption.PARSER;
        }
        
        @Override
        public BattlePassRewardTakeOption getDefaultInstanceForType() {
            return BattlePassRewardTakeOption.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassRewardTakeOption();
            PARSER = new AbstractParser<BattlePassRewardTakeOption>() {
                @Override
                public BattlePassRewardTakeOption parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassRewardTakeOption(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassRewardTakeOptionOrBuilder
        {
            private BattlePassRewardTagOuterClass.BattlePassRewardTag tag_;
            private SingleFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> tagBuilder_;
            private int optionIdx_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassRewardTakeOption.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassRewardTakeOption.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.tagBuilder_ == null) {
                    this.tag_ = null;
                }
                else {
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                }
                this.optionIdx_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassRewardTakeOptionOuterClass.internal_static_BattlePassRewardTakeOption_descriptor;
            }
            
            @Override
            public BattlePassRewardTakeOption getDefaultInstanceForType() {
                return BattlePassRewardTakeOption.getDefaultInstance();
            }
            
            @Override
            public BattlePassRewardTakeOption build() {
                final BattlePassRewardTakeOption result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassRewardTakeOption buildPartial() {
                final BattlePassRewardTakeOption result = new BattlePassRewardTakeOption(this);
                if (this.tagBuilder_ == null) {
                    result.tag_ = this.tag_;
                }
                else {
                    result.tag_ = this.tagBuilder_.build();
                }
                result.optionIdx_ = this.optionIdx_;
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
                if (other instanceof BattlePassRewardTakeOption) {
                    return this.mergeFrom((BattlePassRewardTakeOption)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassRewardTakeOption other) {
                if (other == BattlePassRewardTakeOption.getDefaultInstance()) {
                    return this;
                }
                if (other.hasTag()) {
                    this.mergeTag(other.getTag());
                }
                if (other.getOptionIdx() != 0) {
                    this.setOptionIdx(other.getOptionIdx());
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
                BattlePassRewardTakeOption parsedMessage = null;
                try {
                    parsedMessage = BattlePassRewardTakeOption.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassRewardTakeOption)e.getUnfinishedMessage();
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
            public boolean hasTag() {
                return this.tagBuilder_ != null || this.tag_ != null;
            }
            
            @Override
            public BattlePassRewardTagOuterClass.BattlePassRewardTag getTag() {
                if (this.tagBuilder_ == null) {
                    return (this.tag_ == null) ? BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : this.tag_;
                }
                return this.tagBuilder_.getMessage();
            }
            
            public Builder setTag(final BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
                if (this.tagBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.tag_ = value;
                    this.onChanged();
                }
                else {
                    this.tagBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setTag(final BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder builderForValue) {
                if (this.tagBuilder_ == null) {
                    this.tag_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.tagBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeTag(final BattlePassRewardTagOuterClass.BattlePassRewardTag value) {
                if (this.tagBuilder_ == null) {
                    if (this.tag_ != null) {
                        this.tag_ = BattlePassRewardTagOuterClass.BattlePassRewardTag.newBuilder(this.tag_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.tag_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.tagBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearTag() {
                if (this.tagBuilder_ == null) {
                    this.tag_ = null;
                    this.onChanged();
                }
                else {
                    this.tag_ = null;
                    this.tagBuilder_ = null;
                }
                return this;
            }
            
            public BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder getTagBuilder() {
                this.onChanged();
                return this.getTagFieldBuilder().getBuilder();
            }
            
            @Override
            public BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder() {
                if (this.tagBuilder_ != null) {
                    return this.tagBuilder_.getMessageOrBuilder();
                }
                return (this.tag_ == null) ? BattlePassRewardTagOuterClass.BattlePassRewardTag.getDefaultInstance() : this.tag_;
            }
            
            private SingleFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder> getTagFieldBuilder() {
                if (this.tagBuilder_ == null) {
                    this.tagBuilder_ = new SingleFieldBuilderV3<BattlePassRewardTagOuterClass.BattlePassRewardTag, BattlePassRewardTagOuterClass.BattlePassRewardTag.Builder, BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder>(this.getTag(), this.getParentForChildren(), this.isClean());
                    this.tag_ = null;
                }
                return this.tagBuilder_;
            }
            
            @Override
            public int getOptionIdx() {
                return this.optionIdx_;
            }
            
            public Builder setOptionIdx(final int value) {
                this.optionIdx_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOptionIdx() {
                this.optionIdx_ = 0;
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
    
    public interface BattlePassRewardTakeOptionOrBuilder extends MessageOrBuilder
    {
        boolean hasTag();
        
        BattlePassRewardTagOuterClass.BattlePassRewardTag getTag();
        
        BattlePassRewardTagOuterClass.BattlePassRewardTagOrBuilder getTagOrBuilder();
        
        int getOptionIdx();
    }
}

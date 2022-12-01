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

public final class SkyCrystalDetectorQuickUseResultOuterClass
{
    private static final Descriptors.Descriptor internal_static_SkyCrystalDetectorQuickUseResult_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SkyCrystalDetectorQuickUseResult_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SkyCrystalDetectorQuickUseResultOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SkyCrystalDetectorQuickUseResultOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n&SkyCrystalDetectorQuickUseResult.proto\u001a\u0019Unk2700_CCEOEOHLAPK.proto\"f\n SkyCrystalDetectorQuickUseResult\u00121\n\u0013Unk2700_COIELIGEACL\u0018\t \u0001(\u000b2\u0014.Unk2700_CCEOEOHLAPK\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SkyCrystalDetectorQuickUseResultOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { Unk2700CCEOEOHLAPK.getDescriptor() });
        internal_static_SkyCrystalDetectorQuickUseResult_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SkyCrystalDetectorQuickUseResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_descriptor, new String[] { "Unk2700COIELIGEACL", "Retcode" });
        Unk2700CCEOEOHLAPK.getDescriptor();
    }
    
    public static final class SkyCrystalDetectorQuickUseResult extends GeneratedMessageV3 implements SkyCrystalDetectorQuickUseResultOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_COIELIGEACL_FIELD_NUMBER = 9;
        private Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK unk2700COIELIGEACL_;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SkyCrystalDetectorQuickUseResult DEFAULT_INSTANCE;
        private static final Parser<SkyCrystalDetectorQuickUseResult> PARSER;
        
        private SkyCrystalDetectorQuickUseResult(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SkyCrystalDetectorQuickUseResult() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SkyCrystalDetectorQuickUseResult();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SkyCrystalDetectorQuickUseResult(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 74: {
                            Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder subBuilder = null;
                            if (this.unk2700COIELIGEACL_ != null) {
                                subBuilder = this.unk2700COIELIGEACL_.toBuilder();
                            }
                            this.unk2700COIELIGEACL_ = input.readMessage(Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.unk2700COIELIGEACL_);
                                this.unk2700COIELIGEACL_ = subBuilder.buildPartial();
                                continue;
                            }
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
            return SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SkyCrystalDetectorQuickUseResult.class, Builder.class);
        }
        
        @Override
        public boolean hasUnk2700COIELIGEACL() {
            return this.unk2700COIELIGEACL_ != null;
        }
        
        @Override
        public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL() {
            return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
        }
        
        @Override
        public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder() {
            return this.getUnk2700COIELIGEACL();
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
                output.writeInt32(8, this.retcode_);
            }
            if (this.unk2700COIELIGEACL_ != null) {
                output.writeMessage(9, this.getUnk2700COIELIGEACL());
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
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            if (this.unk2700COIELIGEACL_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getUnk2700COIELIGEACL());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SkyCrystalDetectorQuickUseResult)) {
                return super.equals(obj);
            }
            final SkyCrystalDetectorQuickUseResult other = (SkyCrystalDetectorQuickUseResult)obj;
            return this.hasUnk2700COIELIGEACL() == other.hasUnk2700COIELIGEACL() && (!this.hasUnk2700COIELIGEACL() || this.getUnk2700COIELIGEACL().equals(other.getUnk2700COIELIGEACL())) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasUnk2700COIELIGEACL()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getUnk2700COIELIGEACL().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SkyCrystalDetectorQuickUseResult.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input, extensionRegistry);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input, extensionRegistry);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input);
        }
        
        public static SkyCrystalDetectorQuickUseResult parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SkyCrystalDetectorQuickUseResult.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SkyCrystalDetectorQuickUseResult.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SkyCrystalDetectorQuickUseResult prototype) {
            return SkyCrystalDetectorQuickUseResult.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SkyCrystalDetectorQuickUseResult.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SkyCrystalDetectorQuickUseResult getDefaultInstance() {
            return SkyCrystalDetectorQuickUseResult.DEFAULT_INSTANCE;
        }
        
        public static Parser<SkyCrystalDetectorQuickUseResult> parser() {
            return SkyCrystalDetectorQuickUseResult.PARSER;
        }
        
        @Override
        public Parser<SkyCrystalDetectorQuickUseResult> getParserForType() {
            return SkyCrystalDetectorQuickUseResult.PARSER;
        }
        
        @Override
        public SkyCrystalDetectorQuickUseResult getDefaultInstanceForType() {
            return SkyCrystalDetectorQuickUseResult.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SkyCrystalDetectorQuickUseResult();
            PARSER = new AbstractParser<SkyCrystalDetectorQuickUseResult>() {
                @Override
                public SkyCrystalDetectorQuickUseResult parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SkyCrystalDetectorQuickUseResult(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SkyCrystalDetectorQuickUseResultOrBuilder
        {
            private Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK unk2700COIELIGEACL_;
            private SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder> unk2700COIELIGEACLBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SkyCrystalDetectorQuickUseResult.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SkyCrystalDetectorQuickUseResult.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = null;
                }
                else {
                    this.unk2700COIELIGEACL_ = null;
                    this.unk2700COIELIGEACLBuilder_ = null;
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SkyCrystalDetectorQuickUseResultOuterClass.internal_static_SkyCrystalDetectorQuickUseResult_descriptor;
            }
            
            @Override
            public SkyCrystalDetectorQuickUseResult getDefaultInstanceForType() {
                return SkyCrystalDetectorQuickUseResult.getDefaultInstance();
            }
            
            @Override
            public SkyCrystalDetectorQuickUseResult build() {
                final SkyCrystalDetectorQuickUseResult result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SkyCrystalDetectorQuickUseResult buildPartial() {
                final SkyCrystalDetectorQuickUseResult result = new SkyCrystalDetectorQuickUseResult(this);
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    result.unk2700COIELIGEACL_ = this.unk2700COIELIGEACL_;
                }
                else {
                    result.unk2700COIELIGEACL_ = this.unk2700COIELIGEACLBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof SkyCrystalDetectorQuickUseResult) {
                    return this.mergeFrom((SkyCrystalDetectorQuickUseResult)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SkyCrystalDetectorQuickUseResult other) {
                if (other == SkyCrystalDetectorQuickUseResult.getDefaultInstance()) {
                    return this;
                }
                if (other.hasUnk2700COIELIGEACL()) {
                    this.mergeUnk2700COIELIGEACL(other.getUnk2700COIELIGEACL());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                SkyCrystalDetectorQuickUseResult parsedMessage = null;
                try {
                    parsedMessage = SkyCrystalDetectorQuickUseResult.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SkyCrystalDetectorQuickUseResult)e.getUnfinishedMessage();
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
            public boolean hasUnk2700COIELIGEACL() {
                return this.unk2700COIELIGEACLBuilder_ != null || this.unk2700COIELIGEACL_ != null;
            }
            
            @Override
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
                }
                return this.unk2700COIELIGEACLBuilder_.getMessage();
            }
            
            public Builder setUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK value) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.unk2700COIELIGEACL_ = value;
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder builderForValue) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeUnk2700COIELIGEACL(final Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK value) {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    if (this.unk2700COIELIGEACL_ != null) {
                        this.unk2700COIELIGEACL_ = Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.newBuilder(this.unk2700COIELIGEACL_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.unk2700COIELIGEACL_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACLBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearUnk2700COIELIGEACL() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACL_ = null;
                    this.onChanged();
                }
                else {
                    this.unk2700COIELIGEACL_ = null;
                    this.unk2700COIELIGEACLBuilder_ = null;
                }
                return this;
            }
            
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder getUnk2700COIELIGEACLBuilder() {
                this.onChanged();
                return this.getUnk2700COIELIGEACLFieldBuilder().getBuilder();
            }
            
            @Override
            public Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder() {
                if (this.unk2700COIELIGEACLBuilder_ != null) {
                    return this.unk2700COIELIGEACLBuilder_.getMessageOrBuilder();
                }
                return (this.unk2700COIELIGEACL_ == null) ? Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.getDefaultInstance() : this.unk2700COIELIGEACL_;
            }
            
            private SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder> getUnk2700COIELIGEACLFieldBuilder() {
                if (this.unk2700COIELIGEACLBuilder_ == null) {
                    this.unk2700COIELIGEACLBuilder_ = new SingleFieldBuilderV3<Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK.Builder, Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder>(this.getUnk2700COIELIGEACL(), this.getParentForChildren(), this.isClean());
                    this.unk2700COIELIGEACL_ = null;
                }
                return this.unk2700COIELIGEACLBuilder_;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SkyCrystalDetectorQuickUseResultOrBuilder extends MessageOrBuilder
    {
        boolean hasUnk2700COIELIGEACL();
        
        Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPK getUnk2700COIELIGEACL();
        
        Unk2700CCEOEOHLAPK.Unk2700_CCEOEOHLAPKOrBuilder getUnk2700COIELIGEACLOrBuilder();
        
        int getRetcode();
    }
}

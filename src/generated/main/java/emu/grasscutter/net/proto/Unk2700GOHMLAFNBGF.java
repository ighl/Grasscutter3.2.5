// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class Unk2700GOHMLAFNBGF
{
    private static final Descriptors.Descriptor internal_static_Unk2700_GOHMLAFNBGF_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2700_GOHMLAFNBGF_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2700GOHMLAFNBGF() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2700GOHMLAFNBGF.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2700_GOHMLAFNBGF.proto\u001a\u0017HomeFurnitureData.proto\"c\n\u0013Unk2700_GOHMLAFNBGF\u0012\u001b\n\u0013Unk2700_OALCFEGIBOL\u0018\b \u0001(\r\u0012/\n\u0013Unk2700_CKPNCKDIJMB\u0018\u0003 \u0003(\u000b2\u0012.HomeFurnitureDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2700GOHMLAFNBGF.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeFurnitureDataOuterClass.getDescriptor() });
        internal_static_Unk2700_GOHMLAFNBGF_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2700_GOHMLAFNBGF_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_descriptor, new String[] { "Unk2700OALCFEGIBOL", "Unk2700CKPNCKDIJMB" });
        HomeFurnitureDataOuterClass.getDescriptor();
    }
    
    public static final class Unk2700_GOHMLAFNBGF extends GeneratedMessageV3 implements Unk2700_GOHMLAFNBGFOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK2700_OALCFEGIBOL_FIELD_NUMBER = 8;
        private int unk2700OALCFEGIBOL_;
        public static final int UNK2700_CKPNCKDIJMB_FIELD_NUMBER = 3;
        private List<HomeFurnitureDataOuterClass.HomeFurnitureData> unk2700CKPNCKDIJMB_;
        private byte memoizedIsInitialized;
        private static final Unk2700_GOHMLAFNBGF DEFAULT_INSTANCE;
        private static final Parser<Unk2700_GOHMLAFNBGF> PARSER;
        
        private Unk2700_GOHMLAFNBGF(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2700_GOHMLAFNBGF() {
            this.memoizedIsInitialized = -1;
            this.unk2700CKPNCKDIJMB_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2700_GOHMLAFNBGF();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2700_GOHMLAFNBGF(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                        case 26: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.unk2700CKPNCKDIJMB_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.unk2700CKPNCKDIJMB_.add(input.readMessage(HomeFurnitureDataOuterClass.HomeFurnitureData.parser(), extensionRegistry));
                            continue;
                        }
                        case 64: {
                            this.unk2700OALCFEGIBOL_ = input.readUInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.unk2700CKPNCKDIJMB_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.unk2700CKPNCKDIJMB_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_GOHMLAFNBGF.class, Builder.class);
        }
        
        @Override
        public int getUnk2700OALCFEGIBOL() {
            return this.unk2700OALCFEGIBOL_;
        }
        
        @Override
        public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getUnk2700CKPNCKDIJMBList() {
            return this.unk2700CKPNCKDIJMB_;
        }
        
        @Override
        public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getUnk2700CKPNCKDIJMBOrBuilderList() {
            return this.unk2700CKPNCKDIJMB_;
        }
        
        @Override
        public int getUnk2700CKPNCKDIJMBCount() {
            return this.unk2700CKPNCKDIJMB_.size();
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureData getUnk2700CKPNCKDIJMB(final int index) {
            return this.unk2700CKPNCKDIJMB_.get(index);
        }
        
        @Override
        public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getUnk2700CKPNCKDIJMBOrBuilder(final int index) {
            return this.unk2700CKPNCKDIJMB_.get(index);
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
            for (int i = 0; i < this.unk2700CKPNCKDIJMB_.size(); ++i) {
                output.writeMessage(3, this.unk2700CKPNCKDIJMB_.get(i));
            }
            if (this.unk2700OALCFEGIBOL_ != 0) {
                output.writeUInt32(8, this.unk2700OALCFEGIBOL_);
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
            for (int i = 0; i < this.unk2700CKPNCKDIJMB_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(3, this.unk2700CKPNCKDIJMB_.get(i));
            }
            if (this.unk2700OALCFEGIBOL_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.unk2700OALCFEGIBOL_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2700_GOHMLAFNBGF)) {
                return super.equals(obj);
            }
            final Unk2700_GOHMLAFNBGF other = (Unk2700_GOHMLAFNBGF)obj;
            return this.getUnk2700OALCFEGIBOL() == other.getUnk2700OALCFEGIBOL() && this.getUnk2700CKPNCKDIJMBList().equals(other.getUnk2700CKPNCKDIJMBList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getUnk2700OALCFEGIBOL();
            if (this.getUnk2700CKPNCKDIJMBCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getUnk2700CKPNCKDIJMBList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2700_GOHMLAFNBGF.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_GOHMLAFNBGF parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input);
        }
        
        public static Unk2700_GOHMLAFNBGF parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input, extensionRegistry);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input);
        }
        
        public static Unk2700_GOHMLAFNBGF parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2700_GOHMLAFNBGF.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2700_GOHMLAFNBGF.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2700_GOHMLAFNBGF prototype) {
            return Unk2700_GOHMLAFNBGF.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2700_GOHMLAFNBGF.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2700_GOHMLAFNBGF getDefaultInstance() {
            return Unk2700_GOHMLAFNBGF.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2700_GOHMLAFNBGF> parser() {
            return Unk2700_GOHMLAFNBGF.PARSER;
        }
        
        @Override
        public Parser<Unk2700_GOHMLAFNBGF> getParserForType() {
            return Unk2700_GOHMLAFNBGF.PARSER;
        }
        
        @Override
        public Unk2700_GOHMLAFNBGF getDefaultInstanceForType() {
            return Unk2700_GOHMLAFNBGF.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2700_GOHMLAFNBGF();
            PARSER = new AbstractParser<Unk2700_GOHMLAFNBGF>() {
                @Override
                public Unk2700_GOHMLAFNBGF parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2700_GOHMLAFNBGF(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2700_GOHMLAFNBGFOrBuilder
        {
            private int bitField0_;
            private int unk2700OALCFEGIBOL_;
            private List<HomeFurnitureDataOuterClass.HomeFurnitureData> unk2700CKPNCKDIJMB_;
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> unk2700CKPNCKDIJMBBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2700_GOHMLAFNBGF.class, Builder.class);
            }
            
            private Builder() {
                this.unk2700CKPNCKDIJMB_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unk2700CKPNCKDIJMB_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2700_GOHMLAFNBGF.alwaysUseFieldBuilders) {
                    this.getUnk2700CKPNCKDIJMBFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk2700OALCFEGIBOL_ = 0;
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.unk2700CKPNCKDIJMB_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2700GOHMLAFNBGF.internal_static_Unk2700_GOHMLAFNBGF_descriptor;
            }
            
            @Override
            public Unk2700_GOHMLAFNBGF getDefaultInstanceForType() {
                return Unk2700_GOHMLAFNBGF.getDefaultInstance();
            }
            
            @Override
            public Unk2700_GOHMLAFNBGF build() {
                final Unk2700_GOHMLAFNBGF result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2700_GOHMLAFNBGF buildPartial() {
                final Unk2700_GOHMLAFNBGF result = new Unk2700_GOHMLAFNBGF(this);
                final int from_bitField0_ = this.bitField0_;
                result.unk2700OALCFEGIBOL_ = this.unk2700OALCFEGIBOL_;
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.unk2700CKPNCKDIJMB_ = Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.unk2700CKPNCKDIJMB_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.unk2700CKPNCKDIJMB_ = this.unk2700CKPNCKDIJMB_;
                }
                else {
                    result.unk2700CKPNCKDIJMB_ = this.unk2700CKPNCKDIJMBBuilder_.build();
                }
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
                if (other instanceof Unk2700_GOHMLAFNBGF) {
                    return this.mergeFrom((Unk2700_GOHMLAFNBGF)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2700_GOHMLAFNBGF other) {
                if (other == Unk2700_GOHMLAFNBGF.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk2700OALCFEGIBOL() != 0) {
                    this.setUnk2700OALCFEGIBOL(other.getUnk2700OALCFEGIBOL());
                }
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    if (!other.unk2700CKPNCKDIJMB_.isEmpty()) {
                        if (this.unk2700CKPNCKDIJMB_.isEmpty()) {
                            this.unk2700CKPNCKDIJMB_ = other.unk2700CKPNCKDIJMB_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureUnk2700CKPNCKDIJMBIsMutable();
                            this.unk2700CKPNCKDIJMB_.addAll(other.unk2700CKPNCKDIJMB_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.unk2700CKPNCKDIJMB_.isEmpty()) {
                    if (this.unk2700CKPNCKDIJMBBuilder_.isEmpty()) {
                        this.unk2700CKPNCKDIJMBBuilder_.dispose();
                        this.unk2700CKPNCKDIJMBBuilder_ = null;
                        this.unk2700CKPNCKDIJMB_ = other.unk2700CKPNCKDIJMB_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.unk2700CKPNCKDIJMBBuilder_ = (Unk2700_GOHMLAFNBGF.alwaysUseFieldBuilders ? this.getUnk2700CKPNCKDIJMBFieldBuilder() : null);
                    }
                    else {
                        this.unk2700CKPNCKDIJMBBuilder_.addAllMessages(other.unk2700CKPNCKDIJMB_);
                    }
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
                Unk2700_GOHMLAFNBGF parsedMessage = null;
                try {
                    parsedMessage = Unk2700_GOHMLAFNBGF.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2700_GOHMLAFNBGF)e.getUnfinishedMessage();
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
            public int getUnk2700OALCFEGIBOL() {
                return this.unk2700OALCFEGIBOL_;
            }
            
            public Builder setUnk2700OALCFEGIBOL(final int value) {
                this.unk2700OALCFEGIBOL_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700OALCFEGIBOL() {
                this.unk2700OALCFEGIBOL_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureUnk2700CKPNCKDIJMBIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.unk2700CKPNCKDIJMB_ = new ArrayList<HomeFurnitureDataOuterClass.HomeFurnitureData>(this.unk2700CKPNCKDIJMB_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData> getUnk2700CKPNCKDIJMBList() {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureData>)this.unk2700CKPNCKDIJMB_);
                }
                return this.unk2700CKPNCKDIJMBBuilder_.getMessageList();
            }
            
            @Override
            public int getUnk2700CKPNCKDIJMBCount() {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    return this.unk2700CKPNCKDIJMB_.size();
                }
                return this.unk2700CKPNCKDIJMBBuilder_.getCount();
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureData getUnk2700CKPNCKDIJMB(final int index) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    return this.unk2700CKPNCKDIJMB_.get(index);
                }
                return this.unk2700CKPNCKDIJMBBuilder_.getMessage(index);
            }
            
            public Builder setUnk2700CKPNCKDIJMB(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setUnk2700CKPNCKDIJMB(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700CKPNCKDIJMB(final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.add(value);
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addUnk2700CKPNCKDIJMB(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData value) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addUnk2700CKPNCKDIJMB(final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addUnk2700CKPNCKDIJMB(final int index, final HomeFurnitureDataOuterClass.HomeFurnitureData.Builder builderForValue) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllUnk2700CKPNCKDIJMB(final Iterable<? extends HomeFurnitureDataOuterClass.HomeFurnitureData> values) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.unk2700CKPNCKDIJMB_);
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearUnk2700CKPNCKDIJMB() {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.unk2700CKPNCKDIJMB_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeUnk2700CKPNCKDIJMB(final int index) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.ensureUnk2700CKPNCKDIJMBIsMutable();
                    this.unk2700CKPNCKDIJMB_.remove(index);
                    this.onChanged();
                }
                else {
                    this.unk2700CKPNCKDIJMBBuilder_.remove(index);
                }
                return this;
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder getUnk2700CKPNCKDIJMBBuilder(final int index) {
                return this.getUnk2700CKPNCKDIJMBFieldBuilder().getBuilder(index);
            }
            
            @Override
            public HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getUnk2700CKPNCKDIJMBOrBuilder(final int index) {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    return this.unk2700CKPNCKDIJMB_.get(index);
                }
                return this.unk2700CKPNCKDIJMBBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getUnk2700CKPNCKDIJMBOrBuilderList() {
                if (this.unk2700CKPNCKDIJMBBuilder_ != null) {
                    return this.unk2700CKPNCKDIJMBBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>)this.unk2700CKPNCKDIJMB_);
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addUnk2700CKPNCKDIJMBBuilder() {
                return this.getUnk2700CKPNCKDIJMBFieldBuilder().addBuilder(HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public HomeFurnitureDataOuterClass.HomeFurnitureData.Builder addUnk2700CKPNCKDIJMBBuilder(final int index) {
                return this.getUnk2700CKPNCKDIJMBFieldBuilder().addBuilder(index, HomeFurnitureDataOuterClass.HomeFurnitureData.getDefaultInstance());
            }
            
            public List<HomeFurnitureDataOuterClass.HomeFurnitureData.Builder> getUnk2700CKPNCKDIJMBBuilderList() {
                return this.getUnk2700CKPNCKDIJMBFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getUnk2700CKPNCKDIJMBFieldBuilder() {
                if (this.unk2700CKPNCKDIJMBBuilder_ == null) {
                    this.unk2700CKPNCKDIJMBBuilder_ = new RepeatedFieldBuilderV3<HomeFurnitureDataOuterClass.HomeFurnitureData, HomeFurnitureDataOuterClass.HomeFurnitureData.Builder, HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder>(this.unk2700CKPNCKDIJMB_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.unk2700CKPNCKDIJMB_ = null;
                }
                return this.unk2700CKPNCKDIJMBBuilder_;
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
    
    public interface Unk2700_GOHMLAFNBGFOrBuilder extends MessageOrBuilder
    {
        int getUnk2700OALCFEGIBOL();
        
        List<HomeFurnitureDataOuterClass.HomeFurnitureData> getUnk2700CKPNCKDIJMBList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureData getUnk2700CKPNCKDIJMB(final int p0);
        
        int getUnk2700CKPNCKDIJMBCount();
        
        List<? extends HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder> getUnk2700CKPNCKDIJMBOrBuilderList();
        
        HomeFurnitureDataOuterClass.HomeFurnitureDataOrBuilder getUnk2700CKPNCKDIJMBOrBuilder(final int p0);
    }
}
